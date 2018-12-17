package ExceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional: 在try里面发现问题后，jvm会帮我们生成一个异常对象，然后把这个对象抛出，和catch里面的类进行匹配。
 * 如果该对象是某个类型的，就会执行该catch里面的处理信息。
 * <p>
 * 异常中要了解的几个方法：
 * public String getMessage():异常的消息字符串
 * public String toString():返回异常的简单信息描述
 * 此对象的类的 name(全路径名)
 * ": "（冒号和一个空格）
 * 调用此对象 getLocalizedMessage()方法的结果 (默认返回的是getMessage()的内容)
 * printStackTrace() 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。把信息输出在控制台。
 * @Date: Create in 9:35 2018/6/20
 * @Modify By:
 */
public class Demo6 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
		}



	}
}
