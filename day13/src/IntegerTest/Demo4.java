package IntegerTest;

/**
 * @Auther: Joinlin
 * @Descriptional: 其他进制到十进制
 * public static int parseInt(String s,int radix)
 * @Date: Create in 15:26 2018/6/11
 * @Modify By:
 */
public class Demo4 {
	public static void main(String[] args) {
		int i = Integer.parseInt("100", 2);
		int i2 = Integer.parseInt("100", 8);
		int i3= Integer.parseInt("100", 16);
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
	}
}
