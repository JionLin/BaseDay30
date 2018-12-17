package jiaolin_03;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:19 2018/6/27
 * @Modify By:
 */
public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println(s.age+s.name);
	}
}
