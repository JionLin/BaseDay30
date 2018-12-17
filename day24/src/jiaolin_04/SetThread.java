package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional: 生产者
 * @Date: Create in 10:30 2018/6/27
 * @Modify By:
 */
public class SetThread implements Runnable {
	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	private int x = 0;

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (x % 2 == 0) {
					s.name = "菜菜";
					s.age = 18;
				} else {
					s.age = 20;
					s.name = "jj";
				}
				x++;
			}
		}
	}
}
