package jiaolin_01.test1;

/**
 * @Auther: Joinlin
 * @Descriptional: String类的判断功能：
 * boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
 * boolean contains(String str):判断大字符串中是否包含小字符串
 * booleean startsWith(String str):判断字符串是否以某个指定的字符串开头
 * boolean ndsWith(String str):判断字符串是否以某个指定的字符串结尾
 * boolean isEmpty():判断字符串是否为空。
 * <p>
 * 注意：
 * 字符串内容为空和字符串对象为空。
 * String s = "";
 * String s = null;
 * @Date: Create in 17:04 2018/6/7
 * @Modify By:
 */
public class StringDemo5 {
	public static void main(String[] args) {
		String s1="HelloWorld";
		System.out.println(s1.equals("helloworld"));
		System.out.println(s1.equalsIgnoreCase("helloworld"));
		System.out.println(s1.contains("ello"));
		System.out.println(s1.startsWith("Hell"));
		System.out.println(s1.endsWith("wor"));
		System.out.println(s1.isEmpty());

		String s2="";
		String s3=null;
		System.out.println(s2.isEmpty());
		System.out.println("---");
		System.out.println("s3: "+s3.isEmpty());
	}
}
