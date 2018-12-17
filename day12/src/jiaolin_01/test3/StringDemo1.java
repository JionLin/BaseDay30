package jiaolin_01.test3;

/**
 * @Auther: Joinlin
 * @Descriptional: * 需求：遍历获取字符串中的每一个字符
 * <p>
 * 分析：
 * A:如何能够拿到每一个字符呢?
 * char charAt(int index)
 * B:我怎么知道字符到底有多少个呢?
 * int length()
 * @Date: Create in 10:03 2018/6/8
 * @Modify By:
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String  s="Helloworld";
		for (int x=0;x<s.length();x++){
			System.out.println(s.charAt(x));
		}
	}
}
