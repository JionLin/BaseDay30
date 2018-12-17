/**
 * @Auther: Joinlin
 * @Descriptional: 形式参数是类名的区别
 * 基本类型 和引用类型
 * @Date: Create in 9:14 2018/6/6
 * @Modify By:
 */
public class ArgsTest {
	public static void main(String[] args) {
		StudentDemo studentDemo=new StudentDemo();
		Student student=new Student();
//		student.show();
		studentDemo.method(student);
		Demo demo=new Demo();
		int result = demo.sum(10, 30);
		System.out.println(result);
	}
}
class Demo{
	public int sum(int a,int b){
		return a+b;
	}
}
class Student{
	public void show(){
		System.out.println("我爱学习");
	}
}
class StudentDemo{
	public void method(Student student){
		student.show();
	}
}
