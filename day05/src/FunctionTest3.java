/**
 * @Auther: Joinlin
 * @Descriptional: 键盘录入三个数据，返回三个数中的最大值
 * @Date: Create in 14:54 2018/6/5
 * @Modify By:
 */
public class FunctionTest3 {
	public static void main(String[] args) {
		int result = getSum(5, 2, 3);
		System.out.println(result);
	}

	static int getSum(int a, int b, int c) {
		int temp = a > b ? a : b;
		return temp > c ? temp : c;
	}
}
