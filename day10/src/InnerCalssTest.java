import java.security.PublicKey;

/**
 * @Auther: Joinlin
 * @Descriptional: 面试题：
 * 要求请填空分别输出30，20，10
 * @Date: Create in 14:41 2018/6/7
 * @Modify By:
 */
public class InnerCalssTest {
	public static void main(String[] args) {
		Outer5.Inner5 inner5 = new Outer5().new Inner5();
		inner5.show();
	}
}

class Outer5 {
	public int number = 10;

	class Inner5 {
		public int number = 20;

		public void show() {
			int numbe = 30;
			System.out.println(numbe);
			System.out.println(this.number);
			System.out.println(Outer5.this.number);
		}
	}
}
