package jiaolin_03;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:21 2018/6/27
 * @Modify By:
 */
public class SetThread implements Runnable{
	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.name="林允";
		s.age=18;
	}
}
