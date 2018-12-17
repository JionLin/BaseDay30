/**
 * @Auther: Joinlin
 * @Descriptional: 接口成员特点
 * 成员变量；只能是常量，并且是静态的。
 * 默认修饰符：public static final
 * 建议：自己手动给出。
 * 构造方法：接口没有构造方法。
 * 成员方法：只能是抽象方法。
 * 默认修饰符：public abstract
 * 建议：自己手动给出。
 * <p>
 * 所有的类都默认继承自一个类：Object。
 * 类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
 * @Date: Create in 9:50 2018/6/7
 * @Modify By:
 */
public class InterfaceDemo2 {
	public static void main(String[] args) {
//		Inter inter=new InterImpl();
//		System.out.println(inter.number);
//		System.out.println(inter.number2);
//		System.out.println(inter.number3);
		System.out.println("--------");
		System.out.println(Inter.number);
		System.out.println(Inter.number2);
		System.out.println(Inter.number3);
	}
}
interface Inter{
	int number=10;
	public final int number2=20;
	public static final int number3=30;
	public void show();
}
class InterImpl implements Inter{

	public InterImpl() {
	}

	@Override
	public void show() {
		System.out.println("实现接口,重写其方法");
	}
}
