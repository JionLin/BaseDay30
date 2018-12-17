/**
 * @Auther: Joinlin
 * @Descriptional: 	老师和学生案例,加入抽烟的额外功能
 * @Date: Create in 10:18 2018/6/7
 * @Modify By:
 */
public class InterfaceTest2 {
	public static void main(String[] args) {
		SomkStudent somkStudent=new SomkStudent(18,"林志玲");
		somkStudent.smoking();
		somkStudent.sleep();
		System.out.println(somkStudent.getAge()+";"+somkStudent.getName());
	}
}
interface Somking{
	void smoking();
}
abstract class Person{
	int age;
	String name;

	public Person() {
	}

	public Person(int age, String name) {

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
	public abstract void eat();
	public void sleep(){
		System.out.println("睡觉");
	}
}
class Student2 extends Person{

	public Student2() {
	}

	public Student2(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("学生吃肉");
	}
}
class Teacher2 extends Person{

	public Teacher2() {
	}

	public Teacher2(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("老师吃素");
	}
}
class SomkStudent extends Student2 implements Somking{
	public SomkStudent() {
	}

	public SomkStudent(int age, String name) {
		super(age, name);
	}

	@Override
	public void smoking() {
		System.out.println("掉毛学生抽烟");
	}
}