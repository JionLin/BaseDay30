/**
 * @Auther: Joinlin
 * @Descriptional: 需求：在控制台输出如下的形状
 * ****
 * ****
 * ****
 * ****
 * @Date: Create in 12:33 2018/6/5
 * @Modify By:
 */
public class FunctionDemo2 {
	public static void main(String[] args) {
		printer(4,4);
	}
	static void printer(int m,int n){
		for (int x=0;x<m;x++){
			for (int y=0;y<n;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
