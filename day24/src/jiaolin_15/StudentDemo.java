package jiaolin_15;

/**
 * @Auther: Joinlin
 * @Descriptional: 单例模式：
 * 饿汉式：类一加载就创建对象
 * 懒汉式：用的时候，才去创建对象
 * <p>
 * 面试题：单例模式的思想是什么?请写一个代码体现。
 * <p>
 * 开发：饿汉式(是不会出问题的单例模式)
 * 面试：懒汉式(可能会出问题的单例模式)
 * A:懒加载(延迟加载)
 * B:线程安全问题
 * a:是否多线程环境	是
 * b:是否有共享数据	是
 * c:是否有多条语句操作共享数据 	是
 * <p>
 * 单例模式：保证类在内存中只有一个对象。
 * <p>
 * 如何保证类在内存中只有一个对象呢?
 * A：把构造方法私有
 * B:在成员位置自己创建一个对象
 * C:通过一个公共的方法提供访问
 * <p>
 * <p>
 * 在jdk源码中使用饿汉式开发的为Runtime 类 在lang包下 getRuntime()方法
 * @Date: Create in 10:16 2018/7/2
 * @Modify By:
 */
public class StudentDemo {
	public static void main(String[] args) {
		/*Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);*/

		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);

	}
}
