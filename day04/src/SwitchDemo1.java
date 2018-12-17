import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 根据一到七输入星期几
 * @Date: Create in 9:58 2018/6/5
 * @Modify By:
 */
public class SwitchDemo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入{1-7}");
		int week = scanner.nextInt();
		switch (week) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期天");
				break;
			default:
				System.out.println("输入有误");
				break;
		}

	}
}
