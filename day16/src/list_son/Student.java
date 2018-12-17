package list_son;

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

	public Student(String name,int age) {

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
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;

		Student student = (Student) object;

		if (age != student.age) return false;
		return name.equals(student.name);
	}

	@Override
	public int hashCode() {
		int result = age;
		result = 31 * result + name.hashCode();
		return result;
	}
}
