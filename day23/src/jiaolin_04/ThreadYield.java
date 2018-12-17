package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional: 守护线程
 * @Date: Create in 10:10 2018/6/26
 * @Modify By:
 */
public class ThreadYield extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 10; x++) {
			System.out.println(getName() + "---" + x);
			Thread.yield();
		}
	}
}
