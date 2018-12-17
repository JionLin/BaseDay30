/**
 * @Auther: Joinlin
 * @Descriptional: 继承概述：
 * 把多个类中相同的内容给提取出来定义到一个类中。
 * <p>
 * 如何实现继承呢?
 * Java提供了关键字：extends
 * <p>
 * 格式：
 * class 子类名 extends 父类名 {}
 * <p>
 * 好处：
 * A:提高了代码的复用性
 * B:提高了代码的维护性
 * C:让类与类之间产生了关系，是多态的前提
 * <p>
 * 类与类产生了关系，其实也是继承的一个弊端：
 * 类的耦合性增强了。
 * <p>
 * 开发的原则：低耦合，高内聚。
 * 耦合：类与类的关系
 * 内聚：就是自己完成某件事情的能力
 * @Date: Create in 11:00 2018/6/6
 * @Modify By:
 */
public class ExtendsDemo {
	public static void main(String[] args) {
		Student student=new Student();
		student.eat();
		student.sleep();
		System.out.println("----");
		Teacher teacher2=new Teacher();
		teacher2.eat();
		teacher2.sleep();
	}
}
class Person2{
	public void eat(){
		System.out.println("吃饭");
	}
	public void sleep(){
		System.out.println("睡觉");
	}
}

class Student extends Person2{

}
class Teacher extends Person2{

}