package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional: public final void setDaemon(boolean on):将该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，Java 虚拟机退出。 该方法必须在启动线程前调用。
 * <p>
 * 游戏：坦克大战。
 * @Date: Create in 10:08 2018/6/26
 * @Modify By:
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon t1 = new ThreadDaemon("张飞");
		ThreadDaemon t2 = new ThreadDaemon("关羽");
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();

		Thread.currentThread().setName("刘备");
		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + "--" + x);
		}


	}
}
