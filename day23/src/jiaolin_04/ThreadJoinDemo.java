package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional: public final void join():等待该线程终止。
 * @Date: Create in 10:08 2018/6/26
 * @Modify By:
 */
public class ThreadJoinDemo {
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		t1.setName("李渊");
		t2.setName("李世民");
		t3.setName("李元霸");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("线程终止");
		}
		t2.start();
		t3.start();
	}
}
