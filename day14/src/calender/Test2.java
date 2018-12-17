package calender;

import java.util.Calendar;

/**
 * @Auther: Joinlin
 * @Descriptional: public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
 * public final void set(int year,int month,int date):设置当前日历的年月日
 * @Date: Create in 16:53 2018/6/12
 * @Modify By:
 */
public class Test2 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = Calendar.YEAR;
		int month = Calendar.MONTH;
		int date=Calendar.DAY_OF_MONTH;
		System.out.println(c.get(year)+" 年 "+(c.get(month)+1)+" 月 "+c.get(date)+" 日");

		/*calendar.add(year,2);
		calendar.add(month,-3);
		year=Calendar.YEAR;
		month=Calendar.MONTH;
		day=Calendar.DAY_OF_MONTH;
		System.out.println(calendar.get(year)+" 年 "+(calendar.get(month)+1)+" 月 "+calendar.get(day)+" 日");

		calendar.set(2090,12,29);
		year=calendar.get(Calendar.YEAR);
		month=calendar.get(Calendar.MONTH);
		day=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+" 年 "+(month+1)+" 月 "+day+" 日");*/

		c.set(2011, 11, 11);
		// 获取年
		year = c.get(Calendar.YEAR);
		// 获取月
		month = c.get(Calendar.MONTH);
		// 获取日
		date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

	}
}
