package set_son.demo1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：请按照姓名的长度排序
 * TreeSet集合保证元素排序和唯一性的原理
 * 唯一性：是根据比较的返回是否是0来决定。
 * 排序：
 * A:自然排序(元素具备比较性)
 * 让元素所属的类实现自然排序接口 Comparable
 * B:比较器排序(集合具备比较性)
 * 让集合的构造方法接收一个比较器接口的子类对象 Comparator
 * @Date: Create in 10:12 2018/6/15
 * @Modify By:
 */
public class TreesetDemo5 {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int number1=s2.getName().length()-s1.getName().length();
				int number2=number1==0?s1.getAge()-s2.getAge():number1;
				int number3=number2==0?s1.getName().compareTo(s2.getName()):number2;
				return number3;
			}
		});

		// 创建元素
		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);
		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);

		// 遍历
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
