/**
 * @Auther: Joinlin
 * @Descriptional: 形式参数：
 * 基本类型(太简单，不是我今天要讲解的)
 * 引用类型
 * 类名:(匿名对象的时候其实我们已经讲过了) 需要的是该类的对象
 * 抽象类:
 * 接口
 * @Date: Create in 11:06 2018/6/7
 * @Modify By:
 */
public class StudentTest {
	public static void main(String[] args) {
		StudentDemo2 studentDemo2=new StudentDemo2();
		Student2 s=new Student2();
		studentDemo2.study(s);
		System.out.println("----");
		//匿名对象
		new StudentDemo2().study(new Student2());
	}
}
class Student2{
	public void study(){
		System.out.println("天天日");
	}
}
class StudentDemo2{
	public void study(Student2 s){
		s.study();
	}
}