/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:44 2018/6/6
 * @Modify By:
 */
public class ConstructDemo {
	public static void main(String[] args) {
		Student4 student4=new Student4();
		System.out.println(student4);
	}
}
class Student4 {
	private int age;
	private String name;

	public Student4() {
		System.out.println("这是无参构造");
	}
}
