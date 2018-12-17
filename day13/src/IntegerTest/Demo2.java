package IntegerTest;

/**
 * @Auther: Joinlin
 * @Descriptional: Integer的构造方法：
 * public Integer(int value)
 * public Integer(String s)
 * 注意：这个字符串必须是由数字字符组成
 * @Date: Create in 15:19 2018/6/11
 * @Modify By:
 */
public class Demo2 {
	public static void main(String[] args) {
		Integer ii=new Integer(100);
		System.out.println(ii);

		String s="100";
		Integer i2=new Integer(s);
		System.out.println(s);
	}
}
