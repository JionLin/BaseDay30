/**
 * @Auther: Joinlin
 * @Descriptional: 数组获取最值(获取数组中的最大值最小值)
 * @Date: Create in 15:16 2018/6/5
 * @Modify By:
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] arrs = {10, 20, 39, 2};
		int max = getMax(arrs);
		System.out.println(max);
	}
	static int getMax(int []arrs){
		int max = arrs[0];
		for (int x = 1; x < arrs.length; x++) {
			if (arrs[x] > max) {
				max = arrs[x];
			}
		}
		return max;
	}
}
