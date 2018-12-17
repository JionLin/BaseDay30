/**
 * @Auther: Joinlin
 * @Descriptional: 方法重写的注意事项
 * A:父类中私有方法不能被重写
 * 因为父类私有方法子类根本就无法继承
 * B:子类重写父类方法时，访问权限不能更低
 * 最好就一致
 * C:父类静态方法，子类也必须通过静态方法进行重写
 * 其实这个算不上方法重写，但是现象确实如此，至于为什么算不上方法重写，多态中我会讲解
 * <p>
 * 子类重写父类方法的时候，最好声明一模一样。
 * @Date: Create in 14:49 2018/6/6
 * @Modify By:
 */
public class ExtendsDemo10 {
	public static void main(String[] args) {
		Son10 son10 = new Son10();
		son10.show();
		son10.method();
		son10.function();
	}
}

class Father10 {
	public void show() {
		System.out.println("Father show");
	}

	private void method() {
		System.out.println("Father method");
	}

	public static void function() {
		System.out.println("Father function");
	}
}

class Son10 extends Father10 {
	public void show() {
		System.out.println("Son show");
	}

	public void method() {
		System.out.println("son method");
	}

	public static   void function() {
		System.out.println("son function");
	}
}