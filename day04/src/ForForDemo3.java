/**
 * @Auther: Joinlin
 * @Descriptional: 需求：在控制台输出九九乘法表。
 * @Date: Create in 10:50 2018/6/5
 * @Modify By:
 */
public class ForForDemo3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print(i + "*" + x + "=" + x * i + "\t");
			}
			System.out.println();
		}
	}
}
