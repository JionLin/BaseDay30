package date_Dateformat;

import java.text.ParseException;
import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 16:31 2018/6/12
 * @Modify By:
 */
public class DateUtilsDemo {
	public static void main(String[] args) throws ParseException {
		//把字符串按照指定的格式进行格式化成日期
		String s1="2010-09-10 12:32:22";
		String format="yyyy-MM-dd HH:mm:ss";
		Date date = DateUtils.stringToDate(s1, format);
		System.out.println(date);

		//把日期按照指定的格式解析成字符串
		String s2=DateUtils.stringToString(new Date(),"yyyy年MM月dd日 HH时mm分ss秒");
		System.out.println(s2);
	}
}
