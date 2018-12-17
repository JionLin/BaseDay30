package jiaolin_09;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 11:37 2018/6/26
 * @Modify By:
 */
public class SellTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			synchronized (new Object()) {
				if (tickets > 0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售" + (tickets--) + "张票");
				}
			}
		}
	}
}
