package jiaolin_02;

/**
 * @Auther: Joinlin
 * @Descriptional: 该类要重写run()方法, 为什么呢?
 * 不是类中的所有代码都需要被线程执行的。
 * 而这个时候，为了区分哪些代码能够被线程执行，java提供了Thread类中的run()用来包含那些被线程执行的代码。
 * @Date: Create in 9:41 2018/6/26
 * @Modify By:
 */
public class MyThread extends Thread {
	//用来封装被线程执行的代码
	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + "---" + x);
		}
	}
}
