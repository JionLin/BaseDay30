/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:33 2018/6/6
 * @Modify By:
 */
public class StudentDemo3 {
	public static void main(String[] args) {
		Student3 student3 = new Student3();
		student3.show();
		System.out.println("----");

		student3.name="林志玲";
		student3.setAge(27);
		student3.show();
		System.out.println("---");

		student3.setAge(-27);
		student3.show();
	}
}

class Student3 {
	private int age;
	String name;

	public void setAge(int a) {
		if (a < 0 || a > 120) {
			System.out.println("输入的年龄有问题");
		} else {
			age = a;
		}
	}

	public void show() {
		System.out.println("姓名" + name);
		System.out.println("年龄" + age);
	}
}
