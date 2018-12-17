/**
 * @Auther: Joinlin
 * @Descriptional: return:返回
 * <p>
 * 其实它的作用不是结束循环的，而是结束方法的。
 * @Date: Create in 11:08 2018/6/5
 * @Modify By:
 */
public class BreakDemo3 {
	public static void main(String[] args) {
		for (int x = 0; x < 10; x++) {
			if (x==2){
				System.out.println("over");
				return;
			}
			System.out.println(x);
		}
	}
}
