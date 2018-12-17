package jiaolin_01.test1;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: System类下有一个静态的字段：
 * public static final InputStream in; 标准的输入流，对应着键盘录入。
 * public boolean hasNextXxx():判断是否是某种类型的元素
 * public Xxx nextXxx():获取该元素
 * public String nextLine():获取一个String类型的值
 * @Date: Create in 16:04 2018/6/7
 * @Modify By:
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入:");
		String nextLine = scanner.nextLine();
		System.out.println(nextLine);
		System.out.println("----");
		if (scanner.hasNextInt()) {
			int x = scanner.nextInt();
			System.out.println(x);
		} else {
			System.out.println("输入错误");
		}
	}

}
