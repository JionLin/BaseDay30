package jiaolin_07;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 14:21 2018/6/27
 * @Modify By:
 */
public class SetThread implements Runnable {
	private Student student;

	public SetThread(Student student) {
		this.student = student;
	}

	private int x;

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				student.set(18, "菜菜");
			} else {
				student.set(20, "娇娇");
			}
			x++;
		}
	}
}
