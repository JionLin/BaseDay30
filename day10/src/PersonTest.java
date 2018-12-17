/**
 * @Auther: Joinlin
 * @Descriptional: 形式参数：
 * 基本类型(太简单，不是我今天要讲解的)
 * 引用类型
 * 类名:(匿名对象的时候其实我们已经讲过了)需要的是该类的对象
 * 抽象类:需要的是该抽象的类子类对象
 * 接口
 * @Date: Create in 10:55 2018/6/7
 * @Modify By:
 */
public class PersonTest {
	public static void main(String[] args) {
		PersonDemo personDemo=new PersonDemo();
		Person p=new Student();
		personDemo.method(p);
	}
}
abstract class Person{
	public abstract void study();
}
class Student extends Person{

	@Override
	public void study() {
		System.out.println("好好学习 天天向上");
	}
}
class PersonDemo{
	public void method(Person p){
		p.study();
	}
}