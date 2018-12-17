package jiaolin_01.login_regist.service;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 猜游戏
 * @Date: Create in 16:11 2018/6/14
 * @Modify By:
 */
public class GuessGame {
	public static void start() {
		int number = (int) (Math.random() * 100) + 1;

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请猜一个数字(1-100):");
			int guessNumber = scanner.nextInt();
			if (guessNumber > number) {
				System.out.println("你猜的数字:" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的数字:" + guessNumber + "小了");
			} else {
				System.out.println("恭喜你,猜中了");
				break;
			}
		}
	}
}
