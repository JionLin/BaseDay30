/**
 * @Auther: Joinlin
 * @Descriptional: Object:类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
 * 每个类都直接或者间接的继承自Object类。
 * <p>
 * Object类的方法：
 * public int hashCode():返回该对象的哈希码值。
 * 注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值。
 * 你可以理解为地址值。
 * <p>
 * public final Class getClass():返回此 Object 的运行时类
 * Class类的方法：
 * public String getName()：以 String 的形式返回此 Class 对象所表示的实体
 * @Date: Create in 15:10 2018/6/7
 * @Modify By:
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student student=new Student();
		int hashCode = student.hashCode();
		System.out.println(hashCode);

		Student s2=new Student();
		int result2 = s2.hashCode();
		System.out.println(result2);
		System.out.println("-----");
		Class<? extends Student> aClass = student.getClass();
		System.out.println(aClass);
		System.out.println("---");
		String name = aClass.getName();
		System.out.println(name);
	}
}
