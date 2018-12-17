/**
 * @Auther: Joinlin
 * @Descriptional: 键盘录入两个数据，返回两个数中的较大值
 * @Date: Create in 14:33 2018/6/5
 * @Modify By:
 */
public class FunctionTest {
	public static void main(String[] args) {
		int a = 100;
		int b = 99;
		int sum = getSum(a, b);
		System.out.println(sum);
	}

	static int getSum(int x, int y) {
		return (x > y) ? x : y;
	}
}
