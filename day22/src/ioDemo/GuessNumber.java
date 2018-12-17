package ioDemo;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 15:44 2018/6/25
 * @Modify By:
 */
public class GuessNumber {
	public static void start() {
		//1-100之间
		int number = (int) ((Math.random() * 100) + 1);
		System.out.println(number);
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你要猜的数字");
			int guessNumber = scanner.nextInt();
			if (guessNumber > number) {
				System.out.println("你猜的" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的" + guessNumber + "小了");
			} else {
				System.out.println("恭喜你,猜中了");
				break;
			}
		}
	}
}
