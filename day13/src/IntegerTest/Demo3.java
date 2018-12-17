package IntegerTest;

/**
 * @Auther: Joinlin
 * @Descriptional: int类型和String类型的相互转换
 * int -- String
 * String.valueOf(number)
 * String -- int
 * Integer.parseInt(s)
 * @Date: Create in 15:21 2018/6/11
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) {
		String s1=String.valueOf(100);
		System.out.println(s1);

		String s2="100";
		int i2 = Integer.parseInt(s2);
		System.out.println(i2);
	}
}
