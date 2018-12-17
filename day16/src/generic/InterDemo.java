package generic;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 16:47 2018/6/13
 * @Modify By:
 */
public class InterDemo {
	public static void main(String[] args) {
		//第一种类型,知道是什么的时候
//		Inter<String> inter = new InterImpl();
//		inter.show("林志玲");

		//第二种类型
		Inter<String> inter = new InterImpl<String>();
		inter.show("江疏影");

		Inter<Integer> inter2 = new InterImpl<Integer>();
		inter2.show(2);
	}

}
