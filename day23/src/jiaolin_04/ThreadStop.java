package jiaolin_04;

import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:10 2018/6/26
 * @Modify By:
 */
public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("开始时间 " + new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("线程被终止了");
		}
		System.out.println("结束时间 " + new Date());
	}
}
