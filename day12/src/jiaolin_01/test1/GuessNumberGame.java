package jiaolin_01.test1;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: * 模拟登录,给三次机会,并提示还有几次。如果登录成功，就可以玩猜数字小游戏了。
 * @Date: Create in 17:04 2018/6/7
 * @Modify By:
 */
public class GuessNumberGame {
	public static void start() {

		int guessNumber = (int) ((Math.random() * 100) + 1);
		System.out.println(guessNumber);

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你猜的数字");
			int number = scanner.nextInt();

			if (number > guessNumber) {
				System.out.println("对不起,你猜大了");
			} else if (number < guessNumber) {
				System.out.println("对不起,你猜小了");
			} else {
				System.out.println("恭喜你,猜中了");
				break;
			}
		}
	}
}
