package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional: public final void stop():让线程停止，过时了，但是还可以使用。
 * public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
 * @Date: Create in 10:10 2018/6/26
 * @Modify By:
 */
public class ThreadStopDemo {
	public static void main(String[] args) {
		ThreadStop t1 = new ThreadStop();
		t1.start();
		try {
			Thread.sleep(300);
//			t1.stop();
			t1.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
