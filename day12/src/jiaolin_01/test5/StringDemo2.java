package jiaolin_01.test5;

/**
 * @Auther: Joinlin
 * @Descriptional: * 字符串反转
 * 举例：键盘录入”abc”
 * 输出结果：”cba”
 * 把字符串转为数组
 * @Date: Create in 11:20 2018/6/8
 * @Modify By:
 */
public class StringDemo2 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入字符串");
//		String s = scanner.nextLine();
//		String result = stringReverse(s);
//		System.out.println(result);
		String s = "";
		char[] chars={'1','e','e','e','w'};
		for (int x = chars.length-1; x >= 0; x--) {
			s += chars[x];
		}
		System.out.println(s);
	}

	private static String stringReverse(String string) {
		String s = "";
		char[] chars = string.toCharArray();
		//倒着遍历
		for (int x = chars.length-1; x >= 0; x--) {
			s += chars[x];
		}
		return s;
	}
}
