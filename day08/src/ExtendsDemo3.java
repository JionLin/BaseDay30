/**
 * @Auther: Joinlin
 * @Descriptional: 继承的注意事项：
 * A:子类只能继承父类所有非私有的成员(成员方法和成员变量)
 * B:子类不能继承父类的构造方法，但是可以通过super(马上讲)关键字去访问父类构造方法。
 * C:不要为了部分功能而去继承
 * @Date: Create in 11:10 2018/6/6
 * @Modify By:
 */
public class ExtendsDemo3 {
	public static void main(String[] args) {
		Son2 son2=new Son2();
		son2.function();//20
		son2.method(); //10 20
//		son2.show(); 不能继承父类的私有方法
	}
}
class Father2{
	private int number=10;
	public int number2=20;

	private void show(){
		System.out.println(number);
		System.out.println(number2);
	}
	public void method(){
		System.out.println(number);
		System.out.println(number2);
	}
}
class Son2 extends Father2{
	public void function(){
//		System.out.println(number); 子类不能继承父类的私有方法
		System.out.println(number2);
	}
}