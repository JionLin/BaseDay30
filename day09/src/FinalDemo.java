/**
 * @Auther: Joinlin
 * @Descriptional: final关键字的修饰
 * 特点：
 * final可以修饰类，该类不能被继承。
 * final可以修饰方法，该方法不能被重写。(覆盖，复写)
 * final可以修饰变量，该变量不能被重新赋值。因为这个变量其实常量。
 * @Date: Create in 15:51 2018/6/6
 * @Modify By:
 */
public class FinalDemo {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.show();
	}
}

class Fu {
	int number = 10;
	final int number2 = 20;

}

class Zi extends Fu {
	int number = 30;

	public void show() {
		System.out.println(number);
		System.out.println(number2);
	}
}
