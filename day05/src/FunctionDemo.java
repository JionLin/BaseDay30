/**
 * @Auther: Joinlin
 * @Descriptional: 需求：求两个数据之和的案例
 * @Date: Create in 11:26 2018/6/5
 * @Modify By:
 */
public class FunctionDemo {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int sum = getSum(x, y);
		System.out.println(sum);

	}

	private static int getSum(int a, int b) {
		return a + b;
	}
}
