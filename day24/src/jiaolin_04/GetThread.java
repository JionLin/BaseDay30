package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:33 2018/6/27
 * @Modify By:
 */
public class GetThread implements Runnable{
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true){
			synchronized (s){
				System.out.println(s.name+""+s.age);
			}
		}
	}
}
