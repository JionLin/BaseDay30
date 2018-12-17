package collectionDemo;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:52 2018/6/13
 * @Modify By:
 */
public class Student {
	private int age;
	private String name;

	public Student() {
	}

	public Student(int age, String name) {

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
}
