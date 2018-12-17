package jiaolin_07;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 14:21 2018/6/27
 * @Modify By:
 */
public class GetThread implements Runnable {
	private Student student;

	public GetThread(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		while (true) {
			student.get();
		}
	}
}
