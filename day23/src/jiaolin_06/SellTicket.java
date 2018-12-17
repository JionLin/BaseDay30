package jiaolin_06;

/**
 * @Auther: Joinlin
 * @Descriptional: // 定义100张票
 * // 为了让多个线程对象共享这100张票，我们其实应该用静态修饰
 * @Date: Create in 10:59 2018/6/26
 * @Modify By:
 */
public class SellTicket extends Thread {
	private static int ticket = 100;

	@Override
	public void run() {
		while (true) {
			if (ticket > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + "正在售票" + (ticket--) + "张");
			}
		}
	}
}
