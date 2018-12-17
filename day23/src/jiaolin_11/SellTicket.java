package jiaolin_11;

/**
 * @Auther: Joinlin
 * @Descriptional: A:同步代码块的锁对象是谁呢?
 * 任意对象。
 * <p>
 * B:同步方法的格式及锁对象问题?
 * 把同步关键字加在方法上。
 * <p>
 * 同步方法是谁呢?
 * this
 * <p>
 * C:静态方法及锁对象问题?
 * 静态方法的锁对象是谁呢?
 * 类的字节码文件对象。(反射会讲)
 * @Date: Create in 14:33 2018/6/26
 * @Modify By:
 */
public class SellTicket implements Runnable {
	private static int tickets = 100;

	//使用同一对象
	Object object = new Object();
	//任意对象
	Demo demo = new Demo();
	private int x = 0;

	/*B:同步方法的格式及锁对象问题?
 * 把同步关键字加在方法上。
 * <p>
 * 同步方法是谁呢?*/
	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				/*B:同步方法的格式及锁对象问题?
 * 把同步关键字加在方法上。
 * <p>
 * 同步方法是谁呢?
 * synchronized (this) {
 * this*/
//				synchronized (this) {
				/*C:静态方法及锁对象问题?
 * 静态方法的锁对象是谁呢?
 * 类的字节码文件对象。(反射会讲)*/
				synchronized (SellTicket.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在出售" + (tickets--) + "张票");
					}
				}
			} else {
				ticket();
			}
			x++;
		}
	}

	//任意对象
	/*@Override
	public void run() {
		while (true) {
			synchronized (demo) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售" + (tickets--) + "张票");
				}
			}
		}*/

	//使用object
	/*@Override
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
		}*/
//	}
	/*private synchronized void ticket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售" + (tickets--) + "张票");
		}
	}*/

	//同步在方法上 静态同步
	private static synchronized void ticket() {
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

class Demo {
}