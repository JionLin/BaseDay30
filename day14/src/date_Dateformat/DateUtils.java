package date_Dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional: 把日期转换为字符串格式
 * 把字符串按照指定的格式进行转换
 * @Date: Create in 16:18 2018/6/12
 * @Modify By:
 */
public class DateUtils {
	/**
	 * 把日期按照指定的格式转化为字符串
	 * @param date   输入的日期
	 * @param format 需要转换的格式
	 * @return 返回的字符串格式
	 */
	public static String stringToString(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}

	/**
	 * 把字符串按照指定的格式解析成日期
	 * @param s1
	 * @param format
	 * @return
	 */
	public static Date stringToDate(String s1,String format) throws ParseException {
		return new SimpleDateFormat(format).parse(s1);
	}
}
