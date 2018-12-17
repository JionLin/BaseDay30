/**
 * @Auther: Joinlin
 * @Descriptional: 看程序写结果：
 * A:一个类的静态代码块,构造代码块,构造方法的执行流程
 * 静态代码块 > 构造代码块 > 构造方法
 * B:静态的内容是随着类的加载而加载
 * 静态代码块的内容会优先执行
 * C:子类初始化之前先会进行父类的初始化
 * @Date: Create in 15:30 2018/6/6
 * @Modify By:
 */
public class ExtendsTest {
	public static void main(String[] args) {
		Zi zi=new Zi();

	}
}
class Fu{
	static {
		System.out.println("FU静态代码块");
	}
	{
		System.out.println("FU构造代码块");
	}
	public Fu(){
		System.out.println("FU构造方法");
	}

}
class Zi extends Fu{
	static {
		System.out.println("zi 静态");
	}
	{
		System.out.println("zi 构造代码");
	}
	public Zi(){
		System.out.println("zi 构造方法");
	}
}