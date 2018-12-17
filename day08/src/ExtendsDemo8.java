/**
 * @Auther: Joinlin
 * @Descriptional: 继承中成员方法的关系:
 * A:子类中的方法和父类中的方法声明不一样，这个太简单。
 * B:子类中的方法和父类中的方法声明一样，这个该怎么玩呢?
 * 通过子类对象调用方法：
 * a:先找子类中，看有没有这个方法，有就使用
 * b:再看父类中，有没有这个方法，有就使用
 * c:如果没有就报错。
 * @Date: Create in 14:32 2018/6/6
 * @Modify By:
 */
public class ExtendsDemo8 {
	public static void main(String[] args) {
		Son8 son8=new Son8();
		son8.show();
		son8.method();
	}
}
class Father8{
	public void show(){
		System.out.println("父类的show()");
	}
	public void method(){
		System.out.println("父类的method()");
	}
}
class Son8 extends Father8{
	public void show(){
		System.out.println("子类的show()");
	}

}