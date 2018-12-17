package jiaolin_04;

import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:09 2018/6/26
 * @Modify By:
 */
public class ThreadSleep extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + "---" + x + "日期: " + new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
