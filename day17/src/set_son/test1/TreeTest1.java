package set_son.test1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Auther: Joinlin
 * @Descriptional: 键盘录入5个学生信息(姓名, 语文成绩, 数学成绩, 英语成绩), 按照总分从高到低输出到控制台
 * @Date: Create in 10:27 2018/6/15
 * @Modify By:
 */
public class TreeTest1 {
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				//总分相同,不一定语文,数学,英语,姓名都相同
				int number = s2.getSum() - s1.getSum();
				return number;
			}
		});

		System.out.println("录入信息开始");
		for (int x = 1; x <= 5; x++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入第" + x + "个学生的姓名");
			String name = scanner.nextLine();
			System.out.println("请输入第" + x + "个学生的语文成绩");
			String chinese = scanner.nextLine();
			System.out.println("请输入第" + x + "个学生的数学成绩");
			String math = scanner.nextLine();
			System.out.println("请输入第" + x + "个学生的英语成绩");
			String english = scanner.nextLine();

			Student student = new Student(name, Integer.parseInt(chinese), Integer.parseInt(math), Integer.parseInt(english));
			set.add(student);
		}
		System.out.println("录入信息结束");
		System.out.println("姓名"+"\t"+"语文"+"\t"+"数学"+"\t"+"英语"+"\t");

		for (Student student : set) {
			System.out.println(student.getName() + "\t" + student.getChinese() + "\t" + student.getMath() + "\t" + student.getEnglish());
		}


	}
}
