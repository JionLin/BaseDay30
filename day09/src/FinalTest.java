/**
 * @Auther: Joinlin
 * @Descriptional: 面试题：final修饰局部变量的问题
 * 基本类型：基本类型的值不能发生改变。
 * 引用类型：引用类型的地址值不能发生改变，但是，该对象的堆内存的值是可以改变的。
 * @Date: Create in 15:56 2018/6/6
 * @Modify By:
 */
public class FinalTest {
	public static void main(String[] args) {
		//final修饰局部变量的问题
		final int number=10;
		System.out.println(number);
		int y=20;
		y=30;
		System.out.println(y);
		System.out.println("--------");
		//final修饰引用类型的值
		Fu2 fu2=new Fu2();
		System.out.println(fu2.age);
		fu2.age=100;
		System.out.println(fu2.age);
		System.out.println("----");

		final Fu2 fu3=new Fu2();
		System.out.println(fu3.age);
		fu3.age=200;
		System.out.println(fu3.age);
		System.out.println("-----------");

		//不能在重新赋值
//		fu3=new Fu2();

	}
}

class Fu2 {
	int age = 10;
}