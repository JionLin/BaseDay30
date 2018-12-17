/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 15:18 2018/6/7
 * @Modify By:
 */
public class Student implements Cloneable{
	private int age;
	private String name;

	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;

		Student student = (Student) object;

		if (age != student.age) return false;
		return name != null ? name.equals(student.name) : student.name == null;
	}

	@Override
	public int hashCode() {
		int result = age;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
