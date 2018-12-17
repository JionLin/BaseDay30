/**
 * @Auther: Joinlin
 * @Descriptional: 接口的特点：
 * A:接口用关键字interface表示
 * interface 接口名 {}
 * B:类实现接口用implements表示
 * class 类名 implements 接口名 {}
 * C:接口不能实例化
 * 那么，接口如何实例化呢?
 * 按照多态的方式来实例化。
 * D:接口的子类
 * a:可以是抽象类。但是意义不大。
 * b:可以是具体类。要重写接口中的所有抽象方法。(推荐方案)
 * @Date: Create in 9:45 2018/6/7
 * @Modify By:
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		Animal2 animal2=new Cat2();
		animal2.jump();
	}
}
interface Animal2{
	void jump();
}
abstract class Dog2 implements Animal2{

}
class Cat2 implements Animal2{
	@Override
	public void jump() {
		System.out.println("猫可以跳高");
	}
}