package date_Dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional: Date     --	 String(格式化)
 * public final String format(Date date)
 * String -- Date(解析)
 * public Date parse(String source)
 * DateForamt:可以进行日期和字符串的格式化和解析，
 * 但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * @Date: Create in 16:06 2018/6/12
 * @Modify By:
 */
public class Test3 {
	public static void main(String[] args) throws ParseException {
		//把日期转化为string格式
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(date);
		System.out.println(format);

		//把string格式解析为date格式
		String  s1="2008-12-12 11:23:11";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = sdf2.parse(s1);
		System.out.println(parse);
	}
}
