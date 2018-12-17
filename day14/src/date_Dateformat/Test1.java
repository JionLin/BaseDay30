package date_Dateformat;

import javax.sound.midi.Soundbank;
import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional: Date:表示特定的瞬间，精确到毫秒。
 * <p>
 * 构造方法：
 * Date():根据当前的默认毫秒值创建日期对象
 * Date(long date)：根据给定的毫秒值创建日期对象
 * @Date: Create in 15:57 2018/6/12
 * @Modify By:
 */
public class Test1 {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);

		long time=1000*60*60*24;
		Date d2=new Date(time);
		System.out.println(d2);
	}
}
