package list_son;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：去除集合中自定义对象的重复值(对象的成员变量值都相同)
 * @Date: Create in 11:19 2018/6/13
 * @Modify By:
 */
public class ListDemo3 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("林志玲", 40);
		Student s3 = new Student("凤姐", 35);
		Student s4 = new Student("芙蓉姐姐", 18);
		Student s5 = new Student("翠花", 16);
		Student s6 = new Student("林青霞", 27);
		Student s7 = new Student("林青霞", 18);

		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
//		array.contains("2");  底层重写了equals方法

		for (int x=0;x<array.size()-1;x++){
			for (int y=x+1;y<array.size();y++){
				if (array.get(x).equals(array.get(y))){
					array.remove(y);
					y--;
				}
			}
		}


		//先进行遍历
		Iterator iterator = array.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student.getAge()+"---"+student.getName());
		}


	}
}
