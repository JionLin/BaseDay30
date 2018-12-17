package jiaolin_01.test2;

/**
 * @Auther: Joinlin
 * @Descriptional: String类的获取功能
 * int length():获取字符串的长度。
 * char charAt(int index):获取指定索引位置的字符
 * int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
 * 为什么这里是int类型，而不是char类型?
 * 原因是：'a'和97其实都可以代表'a'
 * int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
 * int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
 * int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
 * String substring(int start):从指定位置开始截取字符串,默认到末尾。
 * String substring(int start,int end):从指定位置开始到指定位置结
 * @Date: Create in 9:21 2018/6/8
 * @Modify By:
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s = "Helloworld";
		System.out.println(s.length());
		System.out.println("---");
		char index = s.charAt(0);
		System.out.println(index);
		System.out.println("---");
		// int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
		System.out.println("indexof: " + s.indexOf('H'));

//		 * int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
		System.out.println("index(int ch,int formIndex): "+s.indexOf('o',6));
		System.out.println("index(int ch,int formIndex): "+s.indexOf('o',30));
		System.out.println("index(int ch,int formIndex): "+s.indexOf('o',0));

		// * int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
		System.out.println(s.indexOf("ello",1));
		System.out.println(s.indexOf("ello",0));
//		 * String substring(int start):从指定位置开始截取字符串,默认到末尾。
		System.out.println("substring(int start): "+s.substring(1));
		System.out.println("substring(int start): "+s.substring(2));
		System.out.println("substring(int start): "+s.substring(2,3));
	}
}
