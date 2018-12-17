/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 14:27 2018/6/5
 * @Modify By:
 */
public class FunctionDemo3 {
	public static void main(String[] args) {
		int sum = getSum(10, 20);
		int sum2 = getSum(10, 20, 30);
		float sum3 = getSum(5.5f, 6.1f);
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

	static float getSum(float a, float b) {
		return a + b;
	}

	static int getSum(int a, int b) {
		return a + b;
	}

	static int getSum(int a, int b, int c) {
		return a + b + c;
	}
}
