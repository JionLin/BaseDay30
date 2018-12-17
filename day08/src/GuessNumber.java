import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 猜数字小游戏 猜出1-100的数字
 * @Date: Create in 10:17 2018/6/6
 * @Modify By:
 */
public class GuessNumber {
	public static void main(String[] args) {
		int numer = (int) (Math.random() * 100) + 1;
		System.out.println(numer);

		while (true) {
//		进行键盘录入
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你猜的");
			int result = scanner.nextInt();
			if (numer > result) {
				System.out.println("你输入的" + result + "小了");
			} else if (numer < result) {
				System.out.println("你输入的"+result+"大了");
			}else {
				System.out.println("恭喜,猜中了");
				break;
			}
		}
	}

}
