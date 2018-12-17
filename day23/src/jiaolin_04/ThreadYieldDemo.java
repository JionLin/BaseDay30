package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional: public static void yield():暂停当前正在执行的线程对象，并执行其他线程。
 * 让多个线程的执行更和谐，但是不能靠它保证一人一次。
 * @Date: Create in 10:10 2018/6/26
 * @Modify By:
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield t1 = new ThreadYield();
		ThreadYield t2 = new ThreadYield();
		t1.setName("jj");
		t2.setName("ss");
		t1.start();
		t2.start();

	}
}
