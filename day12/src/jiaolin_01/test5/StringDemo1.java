package jiaolin_01.test5;

/**
 * @Auther: Joinlin
 * @Descriptional: * String类的其他功能：
 * <p>
 * 替换功能：
 * String replace(char old,char new)
 * String replace(String old,String new)
 * <p>
 * 去除字符串两空格
 * String trim()
 * <p>
 * 按字典顺序比较两个字符串
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 * @Date: Create in 10:33 2018/6/8
 * @Modify By:
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s="HelloWorld";
//		String replace = s.replace("llo", "000");
//		System.out.println(replace);
		System.out.println(s.replace("l","9"));

		String s2="  erere dfdf  ";
		System.out.println(s2.trim());

//		* int compareTo(String str)
// * int compareToIgnoreCase(String str)

		System.out.println("------------------");
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		System.out.println(s6.compareTo(s7));// 0
		System.out.println(s6.compareTo(s8));// 7
		System.out.println(s6.compareTo(s9));// -16

	}
}
