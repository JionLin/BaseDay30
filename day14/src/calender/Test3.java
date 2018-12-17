package calender;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 获取任意一年的二月有多少天
 * <p>
 * 分析：
 * A:键盘录入任意的年份
 * B:设置日历对象的年月日
 * 年就是A输入的数据
 * 月是2
 * 日是1
 * C:把时间往前推一天，就是2月的最后一天
 * D:获取这一天输出即可
 * @Date: Create in 17:19 2018/6/12
 * @Modify By:
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你需要查询的年份: ");
		int year = scanner.nextInt();
		//获取所对应的实例
		Calendar calendar = Calendar.getInstance();
		//设置成3月1号
		calendar.set(year,2,1);
		//把当前天数减一天
		calendar.add(Calendar.DATE,-1);
		//输出对应的天数
		System.out.println(calendar.get(Calendar.DATE));
	}
}
