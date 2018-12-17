import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Auther: Joinlin
 * @Descriptional: 写程序的执行结果。
 * @Date: Create in 10:46 2018/6/6
 * @Modify By:
 */
public class StaticDemo {
	static {
		System.out.println("我是静态主方法");
	}

	public static void main(String[] args) {
		System.out.println("我是main方法");
		Person person = new Person(); // 我是静态主方法 我是main方法  静态代码块 构造代码块 构造方法 构造代码块 构造方法
		Person person2 = new Person();
	}
}

class Person {
	static {
		System.out.println("静态代码块"+10);
	}
	{
		System.out.println("构造代码块"+20);
	}

	public Person() {
		System.out.println("构造方法");
	}
}
