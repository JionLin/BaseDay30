package systemDemo;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 15:29 2018/6/12
 * @Modify By:
 */
public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
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

	@Override
	protected void finalize() throws Throwable {
		System.out.println("当前的对象被回收了" + this);
		super.finalize();
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
