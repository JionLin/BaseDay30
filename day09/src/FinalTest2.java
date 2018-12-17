/**
 * @Auther: Joinlin
 * @Descriptional: final修饰变量的初始化时机
 * A:被final修饰的变量只能赋值一次。
 * B:在构造方法完毕前。(非静态的常量)
 * @Date: Create in 16:24 2018/6/6
 * @Modify By:
 */
public class FinalTest2 {
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.number);
		System.out.println(demo.number2);
	}
}

class Demo {
	int number;
	final int number2;

	public Demo() {
		number = 100;
		number2 = 200;
	}

}
