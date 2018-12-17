/**
 * @Auther: Joinlin
 * @Descriptional: 匿名对象：就是没有名字的对象。
 * @Date: Create in 9:21 2018/6/6
 * @Modify By:
 */
public class NoNameTest {
	public static void main(String[] args) {
		Student2 s2=new Student2();
		s2.show();
		System.out.println("---");
		//匿名对象
		new Student2().show();
		System.out.println("----");

		new StudentDemo2().method(new Student2());

	}
}
class Student2{
	public void show(){
		System.out.println("good good study");
	}

}
class StudentDemo2{
	public void method(Student2 s2){
		s2.show();
	}
}