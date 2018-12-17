package jiaolin_01.test1;

/**
 * @Auther: Joinlin
 * @Descriptional: 字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组。
 * 通过查看API，我们可以知道
 * A:字符串字面值"abc"也可以看成是一个字符串对象。
 * B:字符串是常量，一旦被赋值，就不能被改变。
 * <p>
 * 构造方法：
 * public String():空构造
 * public String(byte[] bytes):把字节数组转成字符串
 * public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
 * public String(char[] value):把字符数组转成字符串
 * public String(char[] value,int index,int count):把字符数组的一部分转成字符串
 * public String(String original):把字符串常量值转成字符串
 * <p>
 * 字符串的方法：
 * public int length()：返回此字符串的长度。
 * @Date: Create in 16:16 2018/6/7
 * @Modify By:
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1:" + s1);
		System.out.println("length:" + s1.length());
		System.out.println("--------------");

		byte[] bytes = {97, 98, 99, 100};
		String s2 = new String(bytes);
		String s3 = new String(bytes, 2, 2);
		System.out.println("s2: " + s2);
		System.out.println(s2.length());
		System.out.println("---");
		System.out.println("s3: " + s3);
		System.out.println("--------------------");

		char[] chars = {'a', 'b', 'c'};
		String s4 = new String(chars);
		System.out.println("s4: " + s4);

		String s5 = new String(chars, 0, 3);
		System.out.println("s5: " + s5);
		//public String(String original):把字符串常量值转成字符串

		String s6 = new String("adfd");
		System.out.println("s6: " + s6);
	}
}
