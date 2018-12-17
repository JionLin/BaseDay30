package jiaolin_04;

/**
 * @Auther: Joinlin
 * @Descriptional: 我们的线程没有设置优先级,肯定有默认优先级。
 * 那么，默认优先级是多少呢?
 * 如何获取线程对象的优先级?
 * 		public final int getPriority():返回线程对象的优先级
 * 如何设置线程对象的优先级呢?
 * 		public final void setPriority(int newPriority)：更改线程的优先级。
 *
 * 注意：
 * 		线程默认优先级是5。
 * 		线程优先级的范围是：1-10。
 * 		线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的效果。
 *
 * IllegalArgumentException:非法参数异常。
 * 抛出的异常表明向方法传递了一个不合法或不正确的参数。
 * @Date: Create in 10:09 2018/6/26
 * @Modify By:
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority t1=new ThreadPriority("1号");
		ThreadPriority t2=new ThreadPriority("2号");
		ThreadPriority t3=new ThreadPriority("3号");

		//默认5  最大以及最少是1-10
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();
		t3.start();

	}
}
