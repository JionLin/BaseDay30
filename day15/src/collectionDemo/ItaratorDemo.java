package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: Iterator iterator():迭代器，集合的专用遍历方式
 * Object next():获取元素,并移动到下一个位置。
 * NoSuchElementException：没有这样的元素，因为你已经找到最后了。
 * boolean hasNext():如果仍有元素可以迭代，则返回 true。
 * @Date: Create in 9:59 2018/6/13
 * @Modify By:
 */
public class ItaratorDemo {
	public static void main(String[] args) {
		List
				c = new ArrayList();
		Student s1 = new Student(18, "林志玲");
		Student s2 = new Student(18, "江疏影");
		Student s3 = new Student(18, "波多");
		Student s4 = new Student(18, "什么鬼");
		Student s5 = new Student(18, "走不到一起");
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		Iterator iterator = c.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student.getAge() + "--" + student.getName());
		}
		System.out.println("---------------");

		for (int x=0;x<c.size();x++){
			Student student=(Student)c.get(x);
			System.out.println(student.getAge()+"--"+student.getName());
		}
	}
}
