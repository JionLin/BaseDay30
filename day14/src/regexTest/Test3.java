package regexTest;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 判断功能
 * String类的public boolean matches(String regex)
 * 需求：
 * 判断手机号码是否满足要求?
 * 分析：
 * A:键盘录入手机号码
 * B:定义手机号码的规则
 * 13436975980
 * 13688886868
 * 13866668888
 * 13456789012
 * 13123456789
 * 18912345678
 * 18886867878
 * 18638833883
 * C:调用功能，判断即可
 * D:输出结果
 * @Date: Create in 9:20 2018/6/12
 * @Modify By:
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入手机号码");
		String s = scanner.nextLine();
		boolean satisfy = isSatisfy(s);
		System.out.println(satisfy);

	}
	//判断手机号码是否满足
	public static boolean isSatisfy(String phone){
		return phone.matches("1[38]\\d{9}");
	}
}
