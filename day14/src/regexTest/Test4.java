package regexTest;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 校验邮箱
 * <p>
 * 分析：
 * A:键盘录入邮箱
 * B:定义邮箱的规则
 * 1517806580@qq.com
 * liuyi@163.com
 * linqingxia@126.com
 * fengqingyang@sina.com.cn
 * fqy@itcast.cn
 * C:调用功能，判断即可
 * D:输出结果
 * @Date: Create in 9:26 2018/6/12
 * @Modify By:
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入邮箱");
		String email = scanner.nextLine();
		boolean checkEmail = checkEmail(email);
		System.out.println(checkEmail);

	}

	//进行邮箱的校验
	public static boolean checkEmail(String email) {
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
		return email.matches(regex);
	}
}
