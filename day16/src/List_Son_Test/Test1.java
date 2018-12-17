package List_Son_Test;

import list_son.Student;

import java.util.ArrayList;

/**
 * @Auther: Joinlin
 * @Descriptional: 集合的嵌套遍历
 * 需求：
 * 我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 就是这个样子的：ArrayList<ArrayList<Student>>
 * @Date: Create in 10:12 2018/6/14
 * @Modify By:
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> lists = new ArrayList<ArrayList<Student>>();
		ArrayList<Student> list1 = new ArrayList<Student>();

		Student student = new Student("蜘蛛精", 25);
		Student student2 = new Student("唐僧", 24);
		Student student3 = new Student("悟空", 23);
		Student student4 = new Student("白骨精", 22);
		list1.add(student);
		list1.add(student2);
		list1.add(student3);
		list1.add(student4);

		ArrayList<Student> list2 = new ArrayList<Student>();
		Student student5 = new Student("唐嫣", 25);
		Student student6 = new Student("林志玲", 24);
		Student student7 = new Student("迪内热巴", 23);
		Student student8 = new Student("波多野结衣", 22);
		list2.add(student5);
		list2.add(student6);
		list2.add(student7);
		list2.add(student8);

		ArrayList<Student> list3 = new ArrayList<Student>();
		Student student9 = new Student("范冰冰", 25);
		Student student10 = new Student("刘涛", 24);
		Student student11 = new Student("林允儿", 23);
		Student student12 = new Student("江疏影", 22);

		list3.add(student9);
		list3.add(student10);
		list3.add(student11);
		list3.add(student12);

		lists.add(list1);
		lists.add(list2);
		lists.add(list3);

		for (ArrayList<Student> s1 : lists) {
			for (Student student1 : s1) {
				System.out.println(student1.getAge() + "--" + student1.getName());
			}
			System.out.println("--------------------");
		}


	}
}
