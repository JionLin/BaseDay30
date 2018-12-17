package jiaolin_03;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:50 2018/6/26
 * @Modify By:
 */
public class MyThread extends Thread {
	public MyThread() {
	}
	//调用父的名字
	public MyThread(String name){
		super(name);
	}

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + "---" + x);
		}
	}
}
