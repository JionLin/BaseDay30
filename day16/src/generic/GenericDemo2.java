package generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：存储自定义对象并遍历。
 * <p>
 * A:创建学生类
 * B:创建集合对象
 * C:创建元素对象
 * D:把元素添加到集合
 * E:遍历集合
 * @Date: Create in 16:17 2018/6/13
 * @Modify By:
 */
public class GenericDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Student s1 = new Student(18, "林志玲");
		Student s2 = new Student(18, "江疏影");
		Student s3 = new Student(18, "波多");
		list.add(s1);
		list.add(s2);
		list.add(s3);

		for (Student student : list) {
			System.out.println(student.getAge() + "---" + student.getName());
		}
		System.out.println("-------------------------------------");
		for (int x = 0; x < list.size(); x++) {
			Student student = list.get(x);
			System.out.println(student.getAge() + "---" + student.getName());
		}

		System.out.println("-------------------------------------");
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.getAge() + "---" + student.getName());
		}
	}
}
