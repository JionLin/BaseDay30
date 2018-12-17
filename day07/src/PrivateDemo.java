/**
 * @Auther: Joinlin
 * @Descriptional: private:
 * 是一个权限修饰符
 * @Date: Create in 9:28 2018/6/6
 * @Modify By:
 */
public class PrivateDemo {
	public static void main(String[] args) {
		Demo2 demo2=new Demo2();
		demo2.show();//10
		demo2.function();//method

	}
}

class Demo2 {
	private int num = 10;

	public void show() {
		System.out.println(num);
	}

	private void method() {
		System.out.println("method");
	}

	public void function() {
		method();
	}
}
