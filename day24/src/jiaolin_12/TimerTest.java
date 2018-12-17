package jiaolin_12;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：在指定的时间删除我们的指定目录(你可以指定c盘，但是我不建议，我使用项目路径下的demo)
 * public Timer()
 * public void schedule(TimerTask task,long delay)
 * public void schedule(TimerTask task,long delay,long period)
 * public void cancel()
 * TimerTask:任务
 * @Date: Create in 16:49 2018/6/27
 * @Modify By:
 */
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		//规定在5点钟删除
		Timer timer = new Timer();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = "2018-6-27 17:23:12";
		Date d = format.parse(date);
		timer.schedule(new MyTimeTask(), d);
	}
}

class MyTimeTask extends TimerTask {

	//删除指定目录的文件夹
	@Override
	public void run() {
		File srcFolder = new File("jiaolin_01");
		deleteFolder(srcFolder);
	}

	private void deleteFolder(File srcFolder) {
		//先获取文件夹里面的所有文件
		for (File file : srcFolder.listFiles()) {
			if (file != null) {
				if (file.isDirectory()) {
					//是目录
					deleteFolder(file);
				} else {
					System.out.println(file.getName() + "===" + file.delete());
				}
			}
		}
		System.out.println(srcFolder.getName() + "===" + srcFolder.delete());
	}
}
