package stringBufferTest;

/**
 * @Auther: Joinlin
 * @Descriptional: * 把数组拼接成一个字符串  {23,34,78,98}; [23,34,78,89]
 * @Date: Create in 16:10 2018/6/8
 * @Modify By:
 */
public class Demo8 {
	public static void main(String[] args) {
		int[] arrs = {23, 34, 78, 98};
		String arrToString = arrToString(arrs);
		System.out.println(arrToString);
	}

	public static String arrToString(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sb.append(arr[x]);
			} else {
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
