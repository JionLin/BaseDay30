package regexTest;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 正则表达式：符合一定规则的字符串。
 * @Date: Create in 9:09 2018/6/12
 * @Modify By:
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入QQ号码:");
		String QQ = scanner.nextLine();
		boolean checkQQ = checkQQ(QQ);
		System.out.println(checkQQ);
	}

	//使用正则表达式
	public static boolean checkQQ(String qq) {
		return qq.matches("[1-9]\\d{4,14}");
	}
}
