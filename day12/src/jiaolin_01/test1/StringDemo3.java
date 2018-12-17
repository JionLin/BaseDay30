package jiaolin_01.test1;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 16:53 2018/6/7
 * @Modify By:
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = new String("hello");
		String s4 = "hello";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		String s5 = "hello";
		String s6 = "hello";
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
	}
}
