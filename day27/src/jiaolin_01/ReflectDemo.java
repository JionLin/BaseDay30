package jiaolin_01;

/**
 * @Auther: Joinlin
 * @Descriptional: 反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法。
 * <p>
 * Person p = new Person();
 * p.使用
 * <p>
 * 要想这样使用，首先你必须得到class文件对象，其实也就是得到Class类的对象。
 * Class类：
 * 成员变量	Field
 * 构造方法	Constructor
 * 成员方法	Method
 * <p>
 * 获取class文件对象的方式：
 * A:Object类的getClass()方法
 * B:数据类型的静态属性class
 * C:Class类中的静态方法
 * public static Class forName(String className)
 * <p>
 * 一般我们到底使用谁呢?
 * A:自己玩	任选一种，第二种比较方便
 * B:开发	第三种
 * 为什么呢?因为第三种是一个字符串，而不是一个具体的类名。这样我们就可以把这样的字符串配置到配置文件中。
 * @Date: Create in 15:08 2018/7/3
 * @Modify By:
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		/* 第一种 Object类的getClass()方法
		Person person = new Person();
		Class<? extends Person> personClass = person.getClass();
		System.out.println(personClass);*/
		//第二种 数据类型的静态属性class
		/*Class<Person> personClass = Person.class;
		System.out.println(personClass);*/
		//第三种
		Class<?> forName = Class.forName("jiaolin_01.Person");
		System.out.println(forName);

	}
}
