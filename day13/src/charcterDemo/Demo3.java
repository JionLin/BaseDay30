package charcterDemo;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * @Date: Create in 15:51 2018/6/11
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入你需要的字符串");
		String s = scanner.nextLine();

		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		//把字符串转换为字符
		char[] chars = s.toCharArray();
		for (int x = 0; x < chars.length; x++) {
			if (Character.isUpperCase(chars[x])) {
				bigCount++;
			} else if (Character.isLowerCase(chars[x])) {
				smallCount++;
			} else if (Character.isDigit(chars[x])) {
				numberCount++;
			}
		}
		System.out.println("大写: " + bigCount);
		System.out.println("小写: " + smallCount);
		System.out.println("数字: " + numberCount);
	}
}
