package diGuiDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：请用代码实现求5的阶乘。
 * 下面的知识要知道：
 * 5! = 1*2*3*4*5
 * 5! = 5*4!
 * <p>
 * 有几种方案实现呢?
 * A:循环实现
 * B:递归实现
 * a:做递归要写一个方法
 * b:出口条件
 * c:规律
 * @Date: Create in 15:31 2018/6/20
 * @Modify By:
 */
public class Demo1 {
	public static void main(String[] args) {
		//用for循环求5的阶乘
		int jc = 1;
		for (int x = 2; x <= 5; x++) {
			jc *= x;
		}
		System.out.println(jc);
		//递归方法
		int n = jiecheng(5);
		System.out.println(n);
	}

	public static int jiecheng(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i * jiecheng(i - 1);
		}
	}
}
