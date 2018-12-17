package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:10 2018/6/26
 * @Modify By:
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		ThreadSleep t3 = new ThreadSleep();
		t1.setName("菜菜");
		t2.setName("素素");
		t3.setName("娇娇");
		t1.start();
		t2.start();
		t3.start();
	}
}
