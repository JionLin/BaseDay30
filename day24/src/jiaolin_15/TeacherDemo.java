package jiaolin_15;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:16 2018/7/2
 * @Modify By:
 */
public class TeacherDemo {
	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1==t2);
		System.out.println(t1);
		System.out.println(t2);
	}
}
