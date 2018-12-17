/**
 * @Auther: Joinlin
 * @Descriptional: 内部类概述:
 * 把类定义在其他类的内部，这个类就被称为内部类。
 * 举例：在类A中定义了一个类B，类B就是内部类。
 * <p>
 * 内部的访问特点：
 * A:内部类可以直接访问外部类的成员，包括私有。
 * B:外部类要访问内部类的成员，必须创建对象。
 * @Date: Create in 11:24 2018/6/7
 * @Modify By:
 */
public class InnerClassDemo {
	public static void main(String[] args) {
		B b=new B();
		b.method();
	}
}

class B {
	private int number = 10;

	class A {
		public void show() {
			System.out.println(number);
		}
	}
	public void method(){
		A a=new A();
		a.show();
	}
}