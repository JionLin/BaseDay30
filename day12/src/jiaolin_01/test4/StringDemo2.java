package jiaolin_01.test4;

/**
 * @Auther: Joinlin
 * @Descriptional: * 需求：把一个字符串的首字母转成大写，
 * 其余为小写。(只考虑英文大小写字母字符)
 * @Date: Create in 10:26 2018/6/8
 * @Modify By:
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "helloWORLD";
		String s1 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(s1);
	}
}
