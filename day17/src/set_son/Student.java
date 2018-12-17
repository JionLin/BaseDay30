package set_son;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:52 2018/6/13
 * @Modify By:
 */
public class Student implements Comparable<Student> {
	private int age;
	private String name;

	public Student() {
	}

	public Student(String name, int age) {

		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student s1) {
		int length = this.name.length() - s1.name.length();
		int number = length == 0 ? s1.age - this.age : length;
		int number2 = number == 0 ? s1.name.compareTo(this.name) : number;
//		int number2 = this.age - s1.age;
		return number2;
	}

	/*@Override
	public int compareTo(Student s) {
		int num = s.age - this.age;
		int num2 = num == 0 ? s.name.compareTo(this.name) : num;
		return num2;
	}*/
}
