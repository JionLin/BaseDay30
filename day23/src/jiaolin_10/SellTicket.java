package jiaolin_10;

/**
 * @Auther: Joinlin
 * @Descriptional: 定义同一把锁
 * @Date: Create in 11:49 2018/6/26
 * @Modify By:
 */
public class SellTicket implements Runnable {
	private int tickets = 100;
	//定义同一把锁
	private Object object = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (object) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售" + (tickets--) + "张票");
				}
			}
		}
	}
}
