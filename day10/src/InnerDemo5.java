/**
 * @Auther: Joinlin
 * @Descriptional: 匿名内部类
 * 就是内部类的简化写法。
 * <p>
 * 前提：存在一个类或者接口
 * 这里的类可以是具体类也可以是抽象类。
 * <p>
 * 格式：
 * new 类名或者接口名(){
 * 重写方法;
 * }
 * <p>
 * 本质是什么呢?
 * 是一个继承了该类或者实现了该接口的子类匿名对象。
 * @Date: Create in 14:33 2018/6/7
 * @Modify By:
 */
public class InnerDemo5 {
	public static void main(String[] args) {
		Outer4 outer4=new Outer4();
		outer4.function();
	}
}
interface Inner4{
	 void show();
	 void method();
}
class Outer4{
	public void function(){
		Inner4 inner4=new Inner4() {
			@Override
			public void show() {
				System.out.println("show()");
			}

			@Override
			public void method() {
				System.out.println("method()");
			}
		};
		inner4.method();
		inner4.show();
	}
}