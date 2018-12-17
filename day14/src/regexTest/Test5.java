package regexTest;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 分割功能
 * String类的public String[] split(String regex)
 * 根据给定正则表达式的匹配拆分此字符串。
 * 举例：
 * 百合网，世纪佳缘,珍爱网,QQ
 * 搜索好友
 * 性别：女
 * 范围："18-24"
 * @Date: Create in 9:37 2018/6/12
 * @Modify By:
 */
public class Test5 {
	public static void main(String[] args) {
		//定义规则
		String ages = "18-24";
		String regex = "-";
		String[] strArray = ages.split(regex);
		//进行年龄的判断
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要找的年龄");
		int age = scanner.nextInt();
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		if (age >= startAge && age < endAge) {
			System.out.println("你是我想要的");
		} else {
			System.out.println("不是我需要的");
		}

	}

}
