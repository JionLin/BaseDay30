import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Auther: Joinlin
 * @Descriptional: 成员内部类:
 * 如何直接访问内部类的成员。
 * 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
 * @Date: Create in 14:09 2018/6/7
 * @Modify By:
 */
public class InnerDemo2 {
	public static void main(String[] args) {
		Outer.Inner inner=new Outer().new Inner();
		inner.show();
	}
}

class Outer {
	int number = 10;

	class Inner {
		public void show(){
			System.out.println(number);
		}

	}
}