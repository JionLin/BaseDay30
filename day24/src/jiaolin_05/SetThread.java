package jiaolin_05;

/**
 * @Auther: Joinlin
 * @Descriptional: 生产者, 有就等待, 没有就生产, 并唤醒.
 * @Date: Create in 10:58 2018/6/27
 * @Modify By:
 */
public class SetThread implements Runnable {
	//需要同一把锁对象
	private Student student;

	public SetThread(Student student) {
		this.student = student;
	}

	private int x = 0;

	@Override
	public void run() {
		while (true) {
			synchronized (student) {
				//如果有,就等待
				if (student.flag) {
					try {
						student.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (x % 2 == 0) {
					student.age = 19;
					student.name = "菜菜";
				} else {
					student.age = 23;
					student.name = "娇娇";
				}

				x++;
				//改为生产状态为true
				student.flag = true;
				//唤醒另外一个
				student.notify();
			}
		}
	}
}
