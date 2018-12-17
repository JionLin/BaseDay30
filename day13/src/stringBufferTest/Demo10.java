package stringBufferTest;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * @Date: Create in 16:26 2018/6/8
 * @Modify By:
 */
public class Demo10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入对称字符");
		String re = scanner.nextLine();
		boolean samll = isSamll(re);
		System.out.println(samll);
		boolean small2 = isSmall2(re);
		System.out.println("small2: " + small2);

	}

	public static boolean isSamll(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}

	//把字符串转成字符数组
	public static boolean isSmall2(String s) {
		boolean flag = true;
		char[] chars = s.toCharArray();
		for (int start = 0, end = chars.length - 1; start <= end; start++, end--) {
			if (chars[start] != chars[end]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
