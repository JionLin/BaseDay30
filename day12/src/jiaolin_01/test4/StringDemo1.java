package jiaolin_01.test4;

/**
 * @Auther: Joinlin
 * @Descriptional: * String的转换功能：
 * byte[] getBytes():把字符串转换为字节数组。
 * char[] toCharArray():把字符串转换为字符数组。
 * static String valueOf(char[] chs):把字符数组转成字符串。
 * static String valueOf(int i):把int类型的数据转成字符串。
 * 注意：String类的valueOf方法可以把任意类型的数据转成字符串。
 * String toLowerCase():把字符串转成小写。
 * String toUpperCase():把字符串转成大写。
 * String concat(String str):把字符串拼接。
 * @Date: Create in 10:14 2018/6/8
 * @Modify By:
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s = "HelloWorld";
		for (byte b : s.getBytes()) {
			System.out.println("byte[] getBytes(): " + b);
		}

		char[] chars = s.toCharArray();
		for (char aChar : chars) {
			System.out.println("把字符串转换为字符数组: "+aChar);
		}
		String charValuesof = s.valueOf(chars);
		System.out.println("把字符数组转成字符串: "+charValuesof);

		//static String valueOf(int i) 把int类型的数据转成字符串
		String intValueof = s.valueOf(1233);
		System.out.println("把int类型的数据转成字符串: "+intValueof);

		System.out.println("转为小写: "+s.toLowerCase());
		System.out.println("转为大写: "+s.toUpperCase());
	}
}
