import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Auther: Joinlin
 * @Descriptional: 局部内部类
 * A:可以直接访问外部类的成员
 * B:在局部位置，可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能
 * <p>
 * 面试题：
 * 局部内部访问局部变量的注意事项?
 * A:局部内部类访类问，我局部变量必须用final修饰
 * B:为什么呢?
 * 局部变量是随着方法的调用而调用，随着调用完毕而消失。
 * 而堆内存的内容并不会立即消失。所以们加final修饰。
 * 加入final修饰后，这个变量就成了常量。既然是常量。你消失了。
 * 我在内存中存储的是数据20，所以，我还是有数据在使用。
 * @Date: Create in 14:23 2018/6/7
 * @Modify By:
 */
public class InnerDemo4 {
	public static void main(String[] args) {
		Outer3 outer3 = new Outer3();
		outer3.show();
	}
}

class Outer3 {
	int number = 10;

	public void show() {
		int number2 = 20;
		class Inner3 {
			public void method() {
				System.out.println(number);
				// System.out.println(number2);
			}
		}
		Inner3 inner3 = new Inner3();
		inner3.method();
	}

}