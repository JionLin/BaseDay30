package IntegerTest;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求1：我要求大家把100这个数据的二进制，八进制，十六进制计算出来
 * 需求2：我要求大家判断一个数据是否是int范围内的。
 * 首先你的知道int的范围是多大?
 * @Date: Create in 15:07 2018/6/11
 * @Modify By:
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		System.out.println("二进制:"+Integer.toBinaryString(100));
		System.out.println("以八进制:"+Integer.toOctalString(100));
		System.out.println("以十六进制: "+Integer.toHexString(100));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

	}
}
