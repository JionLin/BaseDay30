/**
 * @Auther: Joinlin
 * @Descriptional: 控制跳转语句：
 * break:中断
 * continue:继续
 * return:返回
 * <p>
 * break:中断的意思
 * 使用场景：
 * A:switch语句中
 * B:循环语句中。
 * (循环语句中加入了if判断的情况)
 * 注意：离开上面的两个场景，无意义。
 * <p>
 * 如何使用呢?
 * A:跳出单层循环
 * B:跳出多层循环
 * 要想实现这个效果，就必须知道一个东西。带标签的语句。
 * 格式：
 * 标签名: 语句
 * @Date: Create in 10:57 2018/6/5
 * @Modify By:
 */
public class BreakDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("-------");
		wc:
		for (int x = 0; x < 2; x++) {
			nc:
			for (int y = 0; y < 10; y++) {
				if (y == 2) {
					break nc;
//					break wc;
				}
				System.out.println(y);
			}
		}
	}
}
