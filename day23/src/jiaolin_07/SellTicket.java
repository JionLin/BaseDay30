package jiaolin_07;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 11:31 2018/6/26
 * @Modify By:
 */
public class SellTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在售票 " + (tickets--) + "张");
			}
		}
	}
}
