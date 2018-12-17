/**
 * @Auther: Joinlin
 * @Descriptional: 数组元素逆序 (就是把元素对调)
 * @Date: Create in 15:20 2018/6/5
 * @Modify By:
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arrs = {1, 23, 45, 45, 43, 2};
		reverse(arrs);
		println(arrs);
	}

	static void reverse(int[] arrs) {
		for (int x = 0; x < arrs.length / 2; x++) {
			int temp = arrs[arrs.length - 1-x];
			arrs[arrs.length -1- x] = arrs[x];
			arrs[x] = temp;
		}
	}
	public static void println(int []arrs){
		for (int x=0;x<arrs.length;x++){
			System.out.println(arrs[x]);
		}
	}
}
