import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 键盘录入两个数据，比较两个数是否相等
 * <p>
 * 分析：
 * 比较两个数是否相等结果是一个boolean类型。
 * @Date: Create in 14:35 2018/6/5
 * @Modify By:
 */
public class FunctionTest2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入第一个");
		int result1 = scanner.nextInt();
		System.out.println("请输入第二个");
		int result2 = scanner.nextInt();
		boolean flage = isEqual(result1, result2);
		System.out.println(flage);
	}
	static boolean isEqual(int a,int b){
		return a==b;
	}
}
