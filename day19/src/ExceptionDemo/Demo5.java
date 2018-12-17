package ExceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional: 编译时异常和运行时异常的区别
 * 编译期异常：Java程序必须显示处理，否则程序就会发生错误，无法通过编译
 * 运行期异常：无需显示处理，也可以和编译时异常一样处理
 * @Date: Create in 9:31 2018/6/20
 * @Modify By:
 */
public class Demo5 {
	public static void main(String[] args) {
		String s = "2018-06-20";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = null;
		try {
			parse = dateFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(parse);
	}
}
