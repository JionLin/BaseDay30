package jiaolin_12;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Auther: Joinlin
 * @Descriptional: 定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情。
 * 依赖Timer和TimerTask这两个类：
 * Timer:定时
 * public Timer()
 * public void schedule(TimerTask task,long delay)
 * public void schedule(TimerTask task,long delay,long period)
 * public void cancel()
 * TimerTask:任务
 * @Date: Create in 16:35 2018/6/27
 * @Modify By:
 */
public class TimerDemo {
	public static void main(String[] args) {
		Timer t = new Timer();
		//2秒后结束任务
		t.schedule(new MyTask(t), 5000,2000);
//		爆炸任务
//		t.schedule(new MyTask(), 2000);
	}

}

class MyTask extends TimerTask {
	private Timer timer;

	public MyTask(Timer timer) {
		this.timer = timer;
	}

	public MyTask() {
	}

	@Override
	public void run() {
		System.out.println("爆炸了");
//		timer.cancel();
	}
}
