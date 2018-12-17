/**
 * @Auther: Joinlin
 * @Descriptional: do...while循环的基本格式：
 * do {
 * 循环体语句;
 * }while(判断条件语句);
 * <p>
 * 扩展格式；
 * 初始化语句;
 * do {
 * 循环体语句;
 * 控制条件语句;
 * }while(判断条件语句);
 * 输出10次helloworld
 * @Date: Create in 10:40 2018/6/5
 * @Modify By:
 */
public class DoWhileDemo {
	public static void main(String[] args) {
		int i=0;
		do {
			System.out.println("helloworld");
			i++;
		}while (i<10);
	}
}


