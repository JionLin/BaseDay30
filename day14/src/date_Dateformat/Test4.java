package date_Dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 算一下你来到这个世界多少天?
 * <p>
 * 分析：
 * A:键盘录入你的出生的年月日
 * B:把该字符串转换为一个日期
 * C:通过该日期得到一个毫秒值
 * D:获取当前时间的毫秒值
 * E:用D-C得到一个毫秒值
 * F:把E的毫秒值转换为年
 * /1000/60/60/24
 * @Date: Create in 16:36 2018/6/12
 * @Modify By:
 */
public class Test4 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你的出生年月日");
		String birthday = scanner.nextLine();
		//转换为一个日期
//		Date date = DateUtils.stringToDate(birthday, "yyyy-MM-dd");
//		long startTime = date.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = simpleDateFormat.parse(birthday);
		long startTime = d.getTime();
		long nowTime=System.currentTimeMillis();
		long time=(nowTime-startTime)/1000/60/60/24;
		System.out.println(time);
	}
}
