package jiaolin_02;


/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 17:00 2018/6/26
 * @Modify By:
 */
public class DieLock implements Runnable {

	//默认值为false
	public Boolean flag;

	public DieLock(Boolean flag) {
		this.flag = flag;
	}


	@Override
	public void run() {
		//为真
		if (flag) {
			synchronized (MyLock.objA) {
				System.out.println("if objA");
				synchronized (MyLock.objB) {
					System.out.println("if objB");
				}
			}
		} else {
			synchronized (MyLock.objB) {
				System.out.println("else objB");
				synchronized (MyLock.objA) {
					System.out.println("else objA");
				}
			}
		}
	}
}
