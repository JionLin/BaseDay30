package jiaolin_05;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:52 2018/6/26
 * @Modify By:
 */
public class MyRunable implements Runnable {
	@Override
	public void run() {
		for (int x = 0; x < 10; x++) {
			System.out.println(Thread.currentThread().getName() + "---" + x);
		}
	}
}
