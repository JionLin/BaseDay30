/**
 * @Auther: Joinlin
 * @Descriptional: 键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
 * @Date: Create in 15:01 2018/6/5
 * @Modify By:
 */
public class FunctionTest5 {
	public static void main(String[] args) {
		chengfabiao(12);
	}

	static void chengfabiao(int n) {
		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
			}
			System.out.println();
		}
	}
}
