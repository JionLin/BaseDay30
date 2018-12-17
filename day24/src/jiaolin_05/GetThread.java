package jiaolin_05;

/**
 * @Auther: Joinlin
 * @Descriptional: //消费者 有就消费,没有就等待,消费完之后改变状态,并且唤醒
 * @Date: Create in 10:58 2018/6/27
 * @Modify By:
 */
public class GetThread implements Runnable {
	private Student student;

	public GetThread(Student student) {
		this.student = student;
	}

	private int x = 0;

	@Override
	public void run() {
		while (true) {
			synchronized (student) {
				//如果没有,就等待
				if (!student.flag) {
					try {
						student.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(student.age + "==" + student.name);

				x++;
				student.flag = false;
				student.notify();
			}
		}

	}
}
