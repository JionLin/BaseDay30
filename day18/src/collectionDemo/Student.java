package collectionDemo;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:52 2018/6/13
 * @Modify By:
 */
public class Student implements Comparable{
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
	public int compareTo(Object s) {
		Student s2= (Student) s;
		int number=this.age-s2.age;
		int number2=number==0?this.name.compareTo(s2.name):number;
		return number2;
	}

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
