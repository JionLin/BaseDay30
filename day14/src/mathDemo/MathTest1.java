package mathDemo;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：请设计一个方法，可以实现获取任意范围内的随机数。
 * <p>
 * 分析：
 * A:键盘录入两个数据。
 * int strat;
 * int end;
 * B:想办法获取在start到end之间的随机数
 * 我写一个功能实现这个效果，得到一个随机数。(int)
 * C:输出这个随机数
 * @Date: Create in 10:42 2018/6/12
 * @Modify By:
 */
public class MathTest1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入开始值");
		int start = scanner.nextInt();

		System.out.println("请输入结束值");
		int end = scanner.nextInt();

		for (int x = 0; x < 100; x++) {
			int random = getRandom(start, end);
			System.out.println(random);
		}
	}

	//功能实现 返回值int  参数 开始值和结束值
	public static int getRandom(int start, int end) {
		int number = (int) (Math.random() * (end - start + 1)) + start;
		return number;
	}
}
