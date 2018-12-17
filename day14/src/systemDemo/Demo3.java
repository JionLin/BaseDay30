package systemDemo;

import java.util.Arrays;

/**
 * @Auther: Joinlin
 * @Descriptional: arraycopy 从源数组复制到目标数组 从0下标开始数, length指的是复制多少个数字
 * @Date: Create in 15:38 2018/6/12
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		// 请大家看这个代码的意思
//		System.arraycopy(arr, 1, arr2, 2, 2);
		System.arraycopy(arr, 2, arr2, 1, 3);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));//6 33 44 55 10
	}
}
