/**
 * @Auther: Joinlin
 * @Descriptional: 需求：请输出下列的形状
 * <p>
 * *
 * **
 * ***
 * ****
 * @Date: Create in 10:45 2018/6/5
 * @Modify By:
 */
public class ForForDemo2 {
	public static void main(String[] args) {
		for (int i=0;i<=4;i++){
			for (int x=0;x<i;x++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
