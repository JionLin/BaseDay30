package jiaolin_02;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Auther: Joinlin
 * @Descriptional: 键盘录入5个学生信息(姓名, 语文成绩, 数学成绩, 英语成绩), 按照总分从高到低存入文本文件
 * @Date: Create in 10:30 2018/6/25
 * @Modify By:
 */
public class Test9 {
	public static void main(String[] args) throws IOException {
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int number = s2.getSum() - s1.getSum();
				int number2 = number == 0 ? s1.getChinese() - s2.getChinese() : number;
				int number3 = number2 == 0 ? s1.getMath() - s2.getMath() : number2;
				int number4 = number3 == 0 ? s1.getName().compareTo(s2.getName()) : number3;
				return number4;
			}
		});
		for (int x = 1; x <= 3; x++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入第" + x + "个人的姓名");
			String name = scanner.nextLine();
			System.out.println("请输入第" + x + "个人的语文成绩");
			String chinese = scanner.nextLine();
			System.out.println("请输入第" + x + "个人的数学成绩");
			String math = scanner.nextLine();
			System.out.println("请输入第" + x + "个人的英语成绩");
			String english = scanner.nextLine();
			Student student = new Student(name, Integer.parseInt(chinese), Integer.parseInt(math), Integer.parseInt(english));
			set.add(student);
		}
		//把数据写到文本文件
		BufferedWriter writer = new BufferedWriter(new FileWriter("score.txt"));
		writer.write("存储学生信息开始");
		writer.newLine();
		writer.flush();
		for (Student student : set) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(student.getName() + ", " + student.getChinese() + ", " + student.getMath() + ", " + +student.getEnglish());
			writer.write(stringBuilder.toString());
			writer.newLine();
			writer.flush();
		}
	}
}
