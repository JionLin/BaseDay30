package mapDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Auther: Joinlin
 * @Descriptional: TreeMap<Student,String>
 * 键:Student
 * 值：String
 * @Date: Create in 12:36 2018/6/15
 * @Modify By:
 */
public class TreeMapDemo5 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int number = s2.getAge() - s1.getAge();
				int number2 = number == 0 ? s2.getName().compareTo(s1.getName()) : number;
				return number2;
			}
		});

		// 创建学生对象
		Student s1 = new Student("潘安", 30);
		Student s2 = new Student("柳下惠", 35);
		Student s3 = new Student("唐伯虎", 33);
		Student s4 = new Student("燕青", 32);
		Student s5 = new Student("唐伯虎", 33);

		// 存储元素
		tm.put(s1, "宋朝");
		tm.put(s2, "元朝");
		tm.put(s3, "明朝");
		tm.put(s4, "清朝");
		tm.put(s5, "汉朝");

		Set<Student> students = tm.keySet();
		for (Student student : students) {
			String value = tm.get(student);
			System.out.println(student.getAge() + "---" + student.getName() + "---" + value);
		}
	}
}
