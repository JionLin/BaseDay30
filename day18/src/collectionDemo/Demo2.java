package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: Collections可以针对ArrayList存储基本包装类的元素排序，
 * 存储自定义对象可不可以排序呢?
 * @Date: Create in 12:28 2018/6/19
 * @Modify By:
 */
public class Demo2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("刘晓曲", 28);
		Student s4 = new Student("武鑫", 29);
		Student s5 = new Student("林青霞", 27);

		// 添加元素对象
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

//		Collections.sort(list);
//		System.out.println(list);

		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int number = s1.getAge() - s2.getAge();
				int number2 = number == 0 ? s1.getName().compareTo(s2.getName()) : number;
				return number2;
			}
		});
		System.out.println(list);

	}
}
