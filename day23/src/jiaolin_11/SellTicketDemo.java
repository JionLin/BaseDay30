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
 * @Date: Create in 14:34 2018/6/26
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
