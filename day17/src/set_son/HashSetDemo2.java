package set_son;

import java.util.HashSet;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：存储自定义对象，并保证元素的唯一性
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素。
 * 目前是不符合我的要求的：因为我们知道HashSet底层依赖的是hashCode()和equals()方法。
 * 而这两个方法我们在学生类中没有重写，所以，默认使用的是Object类。
 * 这个时候，他们的哈希值是不会一样的，根本就不会继续判断，执行了添加操作。
 * @Date: Create in 9:18 2018/6/15
 * @Modify By:
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Student> set=new HashSet<Student>();
		Student s1=new Student("林志玲",18);
		Student s2=new Student("林允儿",23);
		Student s3=new Student("林志颖",24);
		Student s4=new Student("江疏影",25);
		Student s5=new Student("林允儿",23);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		for (Student s:set){
			System.out.println(s.getAge()+"---"+s.getName());
		}
	}
}
