package JDK5News;

import static java.lang.Math.abs;
import static java.lang.Math.ceil;
/**
 * @Auther: Joinlin
 * @Descriptional: 静态导入：
 * 格式：import static 包名….类名.方法名;
 * 可以直接导入到方法的级别
 * @Date: Create in 9:06 2018/6/14
 * @Modify By:
 */
public class StaticMethod {
	public static void main(String[] args) {
		System.out.println(abs(-12));
		System.out.println(ceil(12.34));
	}
}
