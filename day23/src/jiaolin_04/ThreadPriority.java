package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:09 2018/6/26
 * @Modify By:
 */
public class ThreadPriority extends Thread {
	public ThreadPriority(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + "---" + x);
		}
	}
}
