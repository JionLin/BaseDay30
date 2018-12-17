package systemDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: 请大家给我统计这段程序的运行时间
 * @Date: Create in 15:33 2018/6/12
 * @Modify By:
 */
public class Demo2 {
	public static void main(String[] args) {
//		System.out.println("1号");
//		System.exit(0);
//		System.out.println("2号");
//		System.out.println(System.currentTimeMillis());
		// 要求：请大家给我统计这段程序的运行时间
		long start =System.currentTimeMillis();
		for (int x=0;x<10000;x++){
			System.out.println(x);
		}
		long end=System.currentTimeMillis();
		long time=(end-start);
		System.out.println(time);
	}
}
