package jiaolin_02;

/**
 * @Auther: Joinlin
 * @Descriptional: 同步的弊端：
 * A:效率低
 * B:容易产生死锁
 * <p>
 * 死锁：
 * 两个或两个以上的线程在争夺资源的过程中，发生的一种相互等待的现象。
 * <p>
 * 举例：
 * 中国人，美国人吃饭案例。
 * 正常情况：
 * 中国人:筷子两支
 * 美国人:刀和叉
 * 现在：
 * 中国人：筷子1支，刀一把
 * 美国人：筷子1支，叉一把
 * @Date: Create in 17:01 2018/6/26
 * @Modify By:
 */
public class DieLockDemo {
	public static void main(String[] args) {
		//创建对象
		DieLock d1 = new DieLock(true);
		DieLock d2 = new DieLock(false);

		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);

		t1.start();
		t2.start();


	}
}
