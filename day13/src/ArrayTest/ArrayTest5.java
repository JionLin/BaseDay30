package ArrayTest;

import java.util.Arrays;

/**
 * @Auther: Joinlin
 * @Descriptional: Arrays工具类 Arrays:针对数组进行操作的工具类。比如说排序和查找。
 * 1:public static String toString(int[] a) 把数组转成字符串
 * 2:public static void sort(int[] a) 对数组进行排序
 * 3:public static int binarySearch(int[] a,int key) 二分查找
 * @Date: Create in 11:14 2018/6/11
 * @Modify By:
 */
public class ArrayTest5 {
	public static void main(String[] args) {
		int[] arr = {23, 343, 532, 12, 33};
		System.out.println("排序前:");
		String result = Arrays.toString(arr);
		System.out.println(result);
//		System.out.println("排序后:");
		/*Arrays.sort(arr);
		String result2=Arrays.toString(arr);
		System.out.println(result2);*/

		System.out.println("binarySearch: "+Arrays.binarySearch(arr,532));
		System.out.println("binarySearch: "+Arrays.binarySearch(arr,533));

	}
}
