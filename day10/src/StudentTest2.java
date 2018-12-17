/**
 * @Auther: Joinlin
 * @Descriptional: 返回值类型
 * 基本类型:(基本类型太简单，我不准备讲解)
 * 引用类型：
 * 类:返回的是该类的对象
 * 抽象类:
 * 接口:
 * @Date: Create in 11:11 2018/6/7
 * @Modify By:
 */
public class StudentTest2 {
	public static void main(String[] args) {
		new StudentDemo3().getStudent().study();
	}
}
class Student3{
	public void study(){
		System.out.println("天天日");
	}
}
class StudentDemo3{
	public Student3 getStudent(){
		return new Student3();
	}
}