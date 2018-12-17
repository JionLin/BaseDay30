package ExceptionDemo;

import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 测试类
 * @Date: Create in 10:20 2018/6/20
 * @Modify By:
 */
public class Student {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你的分数");
		int result = scanner.nextInt();
		Teacher teacher=new Teacher();
		try {
			teacher.check(result);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
