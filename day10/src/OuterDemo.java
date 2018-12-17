/**
 * @Auther: Joinlin
 * @Descriptional: 匿名内部类面试题：
 * 按照要求，补齐代码
 * interface Inter { void show(); }
 * class Outer { //补齐代码 }
 * class OuterDemo {
 * public static void main(String[] args) {
 * Outer.method().show();
 * }
 * }
 * 要求在控制台输出”HelloWorld”
 * @Date: Create in 15:00 2018/6/7
 * @Modify By:
 */
public class OuterDemo {
	public static void main(String[] args) {
		Outer6.method().show();
	}
}
interface Inter{
	void show();
}
class Outer6{
	public static Inter method(){
		return new Inter() {
			@Override
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}
