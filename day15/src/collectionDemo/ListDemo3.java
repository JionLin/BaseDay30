package collectionDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: 存储自定义对象并遍历
 * @Date: Create in 10:18 2018/6/13
 * @Modify By:
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List c=new ArrayList();
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

		for (int x=0;x<c.size();x++){
			Student student=(Student)c.get(x);
			System.out.println(student.getAge()+"---"+student.getName());
		}
	}
}
