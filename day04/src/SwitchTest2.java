import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 模拟单项选择题。
 * <p>
 * 分析：
 * A:出一个选择题，然后供你选择。
 * B:键盘录入选择的数据。
 * C:根据选择来给出你选择的结论。
 * @Date: Create in 10:05 2018/6/5
 * @Modify By:
 */
public class SwitchTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("下面的人你最爱谁");
		System.out.println("65 胸大的");
		System.out.println("66 腿长的");
		System.out.println("67 脸好看的");
		System.out.println("68 完美型");

		System.out.println("请输入你选择的");
		int result = scanner.nextInt();
		char re = (char) result;
		switch (re) {
			case 'A':
				System.out.println("输入正确");
				break;
			case 'B':
				System.out.println("输入错误");
				break;
			case 'C':
				System.out.println("输入错误");
				break;
			case 'D':
				System.out.println("输入错误");
				break;
			default:
				System.out.println("输入有误");
				break;
		}

	}
}
