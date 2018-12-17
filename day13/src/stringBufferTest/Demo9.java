package stringBufferTest;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 把字符串反转 键盘录入的方式
 * @Date: Create in 16:19 2018/6/8
 * @Modify By:
 */
public class Demo9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入需要的字符串");
		String s = scanner.nextLine();
		String reverse = reverse(s);
		System.out.println(reverse);

	}
	public static String reverse(String s){
		return new StringBuffer(s).reverse().toString();
	}
}
