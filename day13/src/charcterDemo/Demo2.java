package charcterDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
 * public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
 * public static boolean isDigit(char ch):判断给定的字符是否是数字字符
 * public static char toUpperCase(char ch):把给定的字符转换为大写字符
 * public static char toLowerCase(char ch):把给定的字符转换为小写字符
 * @Date: Create in 15:48 2018/6/11
 * @Modify By:
 */
public class Demo2 {
	public static void main(String[] args) {
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('D'));
	}
}
