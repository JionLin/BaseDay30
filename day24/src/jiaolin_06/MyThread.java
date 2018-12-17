package jiaolin_06;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 11:31 2018/6/27
 * @Modify By:
 */
public class MyThread implements Runnable {
	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(Thread.currentThread().getName() + "===" + x);
		}
	}
}
