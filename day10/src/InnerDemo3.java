/**
 * @Auther: Joinlin
 * @Descriptional: 成员内部类的修饰符：
 * private 为了保证数据的安全性
 * static 为了方便访问数据
 * 注意：静态内部类访问的外部类数据必须用静态修饰。
 * //成员内部类被静态修饰后的访问方式是:
 * //格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
 * @Date: Create in 14:11 2018/6/7
 * @Modify By:
 */
public class InnerDemo3 {
	public static void main(String[] args) {
		Outer2.Inner2 inner2=new Outer2.Inner2();
		inner2.show();
		inner2.method();
		Outer2.Inner2.method();
	}
}
class Outer2{
	private static int number=10;
	public static class Inner2{
		public void show(){
			System.out.println(number);
		}
		public static void method(){
			System.out.println(number);
		}
	}
}