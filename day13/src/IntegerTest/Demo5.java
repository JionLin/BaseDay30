package IntegerTest;

/**
 * @Auther: Joinlin
 * @Descriptional: 看程序写结果
 * @Date: Create in 15:34 2018/6/11
 * @Modify By:
 */
public class Demo5 {
	public static void main(String[] args) {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println("-----------");

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println("-----------");

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
		System.out.println("-----------");

		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);
		System.out.println(i7.equals(i8));
//		 Integer ii = Integer.valueOf(127);
	}
}
