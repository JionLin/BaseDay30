package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther: Joinlin
 * @Descriptional: 练习：用集合存储5个学生对象，并把学生对象进行遍历。
 * <p>
 * 分析：
 * A:创建学生类
 * B:创建集合对象
 * C:创建学生对象
 * D:把学生添加到集合
 * E:把集合转成数组
 * F:遍历数组
 * @Date: Create in 9:52 2018/6/13
 * @Modify By:
 */
public class StudentDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		Student s1=new Student(18,"林志玲");
		Student s2=new Student(18,"江疏影");
		Student s3=new Student(18,"波多");
		Student s4=new Student(18,"什么鬼");
		Student s5=new Student(18,"走不到一起");
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		Object[] objects = c.toArray();
		for (int i = 0; i < objects.length; i++) {
			Object object = objects[i];
			Student student=(Student) object;
			System.out.println(student.getAge()+"---"+student.getName());

		}
	}
}
