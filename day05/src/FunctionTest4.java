/**
 * @Auther: Joinlin
 * @Descriptional: 键盘录入行数和列数，输出对应的星形
 * @Date: Create in 14:57 2018/6/5
 * @Modify By:
 */
public class FunctionTest4 {
	public static void main(String[] args) {
		println(4,4);
	}
	static void println(int x,int y){
		for (int a=0;a<x;a++){
			for (int b=0;b<y;b++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
