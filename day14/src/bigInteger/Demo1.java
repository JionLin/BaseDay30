package bigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Auther: Joinlin
 * @Descriptional: BigInteger:可以让超过Integer范围内的数据进行运算
 * 构造方法：
 * BigInteger(String val)
 * @Date: Create in 15:47 2018/6/12
 * @Modify By:
 */
public class Demo1 {
	public static void main(String[] args) {
		BigInteger bigInteger=new BigInteger("2147483648");
		System.out.println(bigInteger);
	}
}
