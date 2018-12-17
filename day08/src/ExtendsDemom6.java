/**
 * @Auther: Joinlin
 * @Descriptional: 继承中构造方法的关系
 * A:子类中所有的构造方法默认都会访问父类中空参数的构造方法
 * B:为什么呢?
 * 因为子类会继承父类中的数据，可能还会使用父类的数据。
 * 所以，子类初始化之前，一定要先完成父类数据的初始化。
 * <p>
 * 注意：子类每一个构造方法的第一条语句默认都是：super();
 * 子父类继承,先走父类的构造方法,在走子类的构造方法
 * @Date: Create in 14:03 2018/6/6
 * @Modify By:
 */
public class ExtendsDemom6 {
	public static void main(String[] args) {
		Son6 son6=new Son6();
		System.out.println("--------");
		Son6 son7=new Son6("林志玲");

	}
}
class Father6{
	int age;

	public Father6(String name) {
		System.out.println("这是父类的带参");
	}

	public Father6() {
		System.out.println("这是父类的无参");
	}
}
class Son6 extends Father6{
	public Son6() {
		super();
		System.out.println("这是子类的无参");
	}
	public Son6(String name){
		super();
		System.out.println("这是子类的带参");
	}

}
