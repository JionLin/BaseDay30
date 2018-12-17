package ArrayTest;

import java.util.Arrays;

/**
 * @Auther: Joinlin
 * @Descriptional: 把串中的字符进行排序。
 * 定义字符串
 * 把字符串进行
 * 举例："dacgebf"
 * 结果："abcdefg"
 * @Date: Create in 9:43 2018/6/11
 * @Modify By:
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		String str = "dacgebf";
		char[] chars = str.toCharArray();
//		Arrays.sort(chars);
		bubbleSort(chars);
//		把排序后的字符数组转成字符串
		String s = String.valueOf(chars);
	}

	//把字符串转换为字符数组,然后把字符数组进行遍历,遍历好了,就进行排序,在转为字符串
	private static void bubbleSort(char[] chars) {
		for (int x = 0; x < chars.length - 1; x++) {
			for (int y = 0; y < chars.length - 1 - x; y++) {
				if (chars[y] > chars[y + 1]) {
					char temp = chars[y];
					chars[y] = chars[y + 1];
					chars[y + 1] = temp;
				}
			}
		}
	}
}
