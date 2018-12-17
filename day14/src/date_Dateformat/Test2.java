package date_Dateformat;

import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional: public long getTime():获取时间，以毫秒为单位
 * public void setTime(long time):设置时间
 * <p>
 * 从Date得到一个毫秒值
 * getTime()
 * 把一个毫秒值转换为Date
 * 构造方法
 * setTime(long time)
 * @Date: Create in 16:00 2018/6/12
 * @Modify By:
 */
public class Test2 {
	public static void main(String[] args) {
		Date d1=new Date();
		long time = d1.getTime();
		System.out.println(time);
		System.out.println(d1);

		d1.setTime(1000*60*60);
		System.out.println(d1);

	}
}
