package regexTest;

/**
 * @Auther: Joinlin
 * @Descriptional:  * 分割功能练习
 * @Date: Create in 9:52 2018/6/12
 * @Modify By:
 */
public class Test6 {
	public static void main(String[] args) {
		// 定义一个字符串
		String s1 = "aa,bb,cc";
		for (String s : s1.split(",")) {
			System.out.println(s);
		}
		System.out.println("------------");

		String s2 = "aa.bb.cc";
		for (String s : s2.split("\\.")) {
			System.out.println(s);
		}
		System.out.println("------------");
		String s3 = "aa    bb                cc";
		for (String s : s3.split(" +")) {
			System.out.println(s);
		}

		String s4 = "E:\\JavaSE\\day14\\avi";
		for (String s : s4.split("\\\\")) {
			System.out.println(s);
		}
		;
	}
}
