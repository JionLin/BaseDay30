/**
 * @Auther: Joinlin
 * @Descriptional: 学生案例和老师案例讲解
 * @Date: Create in 15:43 2018/6/6
 * @Modify By:
 */

public class ExtendsTest2 {
	public static void main(String[] args) {
		TeacherTest teacherTest = new TeacherTest("波多野结衣", 18);
		System.out.println(teacherTest.getName() + ":" + teacherTest.getAge());

	}
}

class PersonTest {
	String name;
	int age;

	public PersonTest(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public PersonTest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class TeacherTest extends PersonTest {
	public TeacherTest(String name, int age) {
		super(name, age);
	}

	public TeacherTest() {
	}
}

class StudentTest {

}
