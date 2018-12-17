package jiaolin_09;

/**
 * @Auther: Joinlin
 * @Descriptional: 如何解决线程安全问题呢?
 * <p>
 * 要想解决问题，就要知道哪些原因会导致出问题:(而且这些原因也是以后我们判断一个程序是否会有线程安全问题的标准)
 * A:是否是多线程环境
 * B:是否有共享数据
 * C:是否有多条语句操作共享数据
 * <p>
 * 我们来回想一下我们的程序有没有上面的问题呢?
 * A:是否是多线程环境	是
 * B:是否有共享数据	是
 * C:是否有多条语句操作共享数据	是
 * <p>
 * 由此可见我们的程序出现问题是正常的，因为它满足出问题的条件。
 * 接下来才是我们要想想如何解决问题呢?
 * A和B的问题我们改变不了，我们只能想办法去把C改变一下。
 * 思想：
 * 把多条语句操作共享数据的代码给包成一个整体，让某个线程在执行的时候，别人不能来执行。
 * 问题是我们不知道怎么包啊?其实我也不知道，但是Java给我们提供了：同步机制。
 * <p>
 * 同步代码块：
 * synchronized(对象){
 * 需要同步的代码;
 * }
 * <p>
 * A:对象是什么呢?
 * 我们可以随便创建一个对象试试。
 * B:需要同步的代码是哪些呢?
 * 把多条语句操作共享数据的代码的部分给包起来
 * <p>
 * 注意：
 * 同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
 * 多个线程必须是同一把锁。
 * @Date: Create in 11:37 2018/6/26
 * @Modify By:
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		t1.start();
		t2.start();
		t3.start();

	}
}
