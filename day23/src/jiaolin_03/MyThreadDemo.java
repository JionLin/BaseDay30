package jiaolin_03;

/**
 * @Auther: Joinlin
 * @Descriptional: 如何获取线程对象的名称呢?
 * public final String getName():获取线程的名称。
 * 如何设置线程对象的名称呢?
 * public final void setName(String name):设置线程的名称
 * <p>
 * 针对不是Thread类的子类中如何获取线程对象名称呢?
 * public static Thread currentThread():返回当前正在执行的线程对象
 * Thread.currentThread().getName()
 * // 创建线程对象
 * //无参构造+setXxx()
 * // MyThread my1 = new MyThread();
 * // MyThread my2 = new MyThread();
 * // //调用方法设置名称
 * // my1.setName("林青霞");
 * // my2.setName("刘意");
 * // my1.start();
 * // my2.start();
 * <p>
 * //带参构造方法给线程起名字
 * // MyThread my1 = new MyThread("林青霞");
 * // MyThread my2 = new MyThread("刘意");
 * // my1.start();
 * // my2.start();
 * <p>
 * //我要获取main方法所在的线程对象的名称，该怎么办呢?
 * //遇到这种情况,Thread类提供了一个很好玩的方法:
 * //public static Thread currentThread():返回当前正在执行的线程对象
 * 名称为什么是：Thread-? 编号
 * <p>
 * class Thread {
 * private char name[];
 * <p>
 * public Thread() {
 * init(null, null, "Thread-" + nextThreadNum(), 0);
 * }
 * <p>
 * private void init(ThreadGroup g, Runnable target, String name,
 * long stackSize) {
 * init(g, target, name, stackSize, null);
 * }
 * <p>
 * private void init(ThreadGroup g, Runnable target, String name,
 * long stackSize, AccessControlContext acc) {
 * //大部分代码被省略了
 * this.name = name.toCharArray();
 * }
 * <p>
 * public final void setName(String name) {
 * this.name = name.toCharArray();
 * }
 * <p>
 * <p>
 * private static int threadInitNumber; //0,1,2
 * private static synchronized int nextThreadNum() {
 * return threadInitNumber++; //return 0,1
 * }
 * <p>
 * public final String getName() {
 * return String.valueOf(name);
 * }
 * }
 * <p>
 * class MyThread extends Thread {
 * public MyThread() {
 * super();
 * }
 * }
 * @Date: Create in 9:53 2018/6/26
 * @Modify By:
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		my1.setName("菜菜");
//		MyThread my1 = new MyThread("菜菜");
		MyThread my2 = new MyThread();
		my2.setName("素素");
//		MyThread my2 = new MyThread("素素");
		my1.start();
		my2.start();
		System.out.println(Thread.currentThread().getName());
	}
}
