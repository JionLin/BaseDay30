package LoginIO.test;



import LoginIO.dao.UserDao;
import LoginIO.dao.impl.UserDaoImpl;
import LoginIO.pojo.User;
import LoginIO.service.GuessGame;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 11:48 2018/6/14
 * @Modify By:
 */
public class UserTest {
	public static void main(String[] args) {
		System.out.println("---------------欢迎光临---------------");
		while (true) {
			System.out.println("1	登录");
			System.out.println("2	注册");
			System.out.println("3	退出");
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你的选择");
			String choice = scanner.nextLine();
			UserDao userDao = new UserDaoImpl();
			User user = new User();
			switch (choice) {
				case "1":
					System.out.println("---------------登录页面---------------");
					System.out.println("请输入用户名 ");
					String username = scanner.nextLine();
					System.out.println("请输入密码: ");
					String password = scanner.nextLine();
					boolean flag = userDao.isLogin(username, password);
					if (flag) {
						System.out.println("恭喜你,登录成功,可以玩游戏了");
						Scanner scanner1 = new Scanner(System.in);
						System.out.println("你玩游戏吗?y/n");
						while (true) {
							String playGame = scanner1.nextLine();
							if (playGame.equalsIgnoreCase("y")) {
								GuessGame.start();
								System.out.println("你还玩吗?y/n");
							} else {
								System.out.println("欢迎下次光临");
								break;
							}
						}
						System.exit(0);
					} else {
						System.out.println("用户名和密码输入错误,请重新输入");
					}
					break;
				case "2":
					System.out.println("---------------注册页面---------------");
					System.out.println("请输入需要注册的名字: ");
					String oldUsername = scanner.nextLine();
					System.out.println("请输入需要注册的密码: ");
					String oldPassword = scanner.nextLine();
					user = new User(oldUsername, oldPassword);
					userDao.regist(user);
					System.out.println("恭喜你,注册成功");
					break;
				case "3":
				default:
					System.out.println("谢谢光临,欢迎下次再来");
					System.exit(0);
					break;
			}
		}
	}
}
