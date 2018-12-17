/**
 * @Auther: Joinlin
 * @Descriptional: 需求： A:求1-100之和。
 * B:求出1-100之间偶数和
 * C:求出1-100之间奇数和(自己做)
 * @Date: Create in 10:23 2018/6/5
 * @Modify By:
 */
public class ForDemo4 {
	public static void main(String[] args) {
		int count = 0;
/*
		for (int i = 1; i <= 100; i++) {
			count += i;
		}
*/
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				count += i;
			}
		}
/*
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				count += i;
			}
		}
*/
		System.out.println(count);
	}
}
