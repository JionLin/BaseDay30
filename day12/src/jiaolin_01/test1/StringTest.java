package jiaolin_01.test1;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 17:18 2018/6/7
 * @Modify By:
 */
public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";

		for (int x = 0; x < 3; x++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入账号");
			String name = scanner.nextLine();
			System.out.println("请输入密码");
			String pwd = scanner.nextLine();
			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("输入正确,开始打游戏");
				GuessNumberGame.start();
				break;
			} else {
				if (2 - x == 0) {
					System.out.println("你的账户被锁定,请与管理员联系");
				} else {
					System.out.println("你还有" + (2 - x) + "次机会");
				}
			}
		}
	}
}
