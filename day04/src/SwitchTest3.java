import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 用switch语句实现键盘录入月份，输出对应的季节
 * @Date: Create in 10:13 2018/6/5
 * @Modify By:
 */
public class SwitchTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入季节{1-12}");
		int month = scanner.nextInt();
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;

			default:
				System.out.println("输入错误");
				break;
		}
	}
}
