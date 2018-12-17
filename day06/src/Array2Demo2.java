/**
 * @Auther: Joinlin
 * @Descriptional: 需求：二维数组遍历
 * @Date: Create in 15:49 2018/6/5
 * @Modify By:
 */
public class Array2Demo2 {
	public static void main(String[] args) {
		int[][] arrs = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
		println(arrs);
	}

	public static void println(int[][] arrs) {
		for (int i = 0; i < arrs.length; i++) {
			for (int x = 0; x < arrs[i].length; x++) {
				System.out.print(arrs[i][x] + " ");
			}
			System.out.println();
		}
	}
}
