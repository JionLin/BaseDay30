package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:08 2018/6/26
 * @Modify By:
 */
public class ThreadJoin extends Thread {
	@Override
	public void run() {
		for (int x=0;x<100;x++){
			System.out.println(getName()+"---"+x);
		}
	}
}
