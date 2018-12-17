package jiaolin_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: Joinlin
 * @Descriptional: 虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁，
 * 为了更清晰的表达如何加锁和释放锁,JDK5以后提供了一个新的锁对象Lock。
 * <p>
 * Lock：
 * void lock()： 获取锁。
 * void unlock():释放锁。
 * ReentrantLock是Lock的实现类.
 * @Date: Create in 15:56 2018/6/26
 * @Modify By:
 */
public class SellTickets implements Runnable {
	private int tickets = 100;

	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			try {
				lock.lock();
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售" + (tickets--) + "张票");
				}
			} finally {
				lock.unlock();
			}
		}
	}
}
