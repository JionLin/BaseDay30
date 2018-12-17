/**
 * @Auther: Joinlin
 * @Descriptional: 需求：请输出一个4行5列的星星(*)图案。
 * 结果：
 * ****
 * ****
 * ****
 * ****
 * @Date: Create in 10:43 2018/6/5
 * @Modify By:
 */
public class ForForDemo {
	public static void main(String[] args) {
		for (int x = 0; x < 4; x++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
