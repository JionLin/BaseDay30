/**
 * @Auther: Joinlin
 * @Descriptional: 学生案例
 * 具体事务：基础班学员，就业班学员
 * 共性：姓名，年龄，班级，学习，吃饭
 * 分析: 从具体到抽象
 * 基础班学员:变量: 姓名,年龄,班级,
 * 方法:
 * 抽象方法:学习
 * 成员方法:吃饭
 * 实现:从抽象到具体
 * @Date: Creat in 9:19 2018/6/7
 * @Modify By:
 */
public class AbstractTest2 {
	public static void main(String[] args) {
		Student student=new BasicStudent();
		student.eat();
		student.study();

		student=new WorkStudent();
		student.study();
		student.eat();
	}
}
abstract class Student{
	int age;
	String grand;
	String name;

	public Student() {
	}

	public Student(int age, String grand, String name) {

		this.age = age;
		this.grand = grand;
		this.name = name;
	}
	public abstract void study();
	public void eat(){
		System.out.println("吃饭");
	}
}
class BasicStudent extends Student{

	@Override
	public void study() {
		System.out.println("基础班学se");
	}

	public BasicStudent() {
	}

	public BasicStudent(int age, String grand, String name) {
		super(age, grand, name);
	}
}
class WorkStudent extends Student{

	@Override
	public void study() {
		System.out.println("学习ee");
	}

	public WorkStudent() {
	}

	public WorkStudent(int age, String grand, String name) {
		super(age, grand, name);
	}
}