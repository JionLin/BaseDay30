package calender;

import java.util.Calendar;

/**
 * @Auther: Joinlin
 * @Descriptional:  Calendar:它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR
 * 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 *
 * public int get(int field):返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型。
 * @Date: Create in 16:46 2018/6/12
 * @Modify By:
 */
public class Test1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		System.out.println("年:"+calendar.get(Calendar.YEAR)+" 月:"+(calendar.get(Calendar.MONTH)+1)+" 日:"+calendar.get(Calendar.DAY_OF_MONTH));

	}

}
