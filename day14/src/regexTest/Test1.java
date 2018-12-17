package regexTest;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 校验qq号码.
 * 1:要求必须是5-15位数字
 * 2:0不能开头
 * 分析：
 * A:键盘录入一个QQ号码
 * B:写一个功能实现校验
 * C:调用功能，输出结果。
 * @Date: Create in 8:52 2018/6/12
 * @Modify By:
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你的qq号码");
		String s = scanner.nextLine();
		boolean checkQQ = checkQQ(s);
		System.out.println("checkQQ: "+checkQQ);
	}

	//进行功能实现
	public static boolean checkQQ(String qq) {
		boolean flag = true;
		//进行判断 5到15位
		//0不能开头
		if (qq.length() >= 5 && qq.length() <= 15) {
			char[] chars = qq.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char aChar = chars[i];
				if (chars[0] == '0' || Character.isDigit(chars[i])) {
					flag=false;
					break;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}
}
