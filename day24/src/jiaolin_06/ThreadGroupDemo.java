package jiaolin_06;

/**
 * @Auther: Joinlin
 * @Descriptional: 线程组： 把多个线程组合到一起。
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 * @Date: Create in 11:31 2018/6/27
 * @Modify By:
 */
public class ThreadGroupDemo {
	// 我不知道他们属于那个线程组,我想知道，怎么办
	// 线程类里面的方法：public final ThreadGroup getThreadGroup()
	// 线程组里面的方法：public final String getName()
	// 通过结果我们知道了：线程默认情况下属于main线程组
	// 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
	public static void main(String[] args) {
//		method1();
		method2();

	}

	private static void method2() {
		ThreadGroup tg=new ThreadGroup("1号");
		MyThread my=new MyThread();
		Thread t1=new Thread(tg,my,"菜菜");
		Thread t2=new Thread(tg,my,"娇娇");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		//设置为后台线程
		tg.setDaemon(true);
	}

	private static void method1() {
		//进行默认查看线程组是什么
		MyThread my = new MyThread();

		Thread t1 = new Thread(my, "菜菜");
		Thread t2 = new Thread(my, "娇娇");

		String name = t1.getThreadGroup().getName();
		String name2 = t2.getThreadGroup().getName();
		System.out.println("name: " + name + " name2: " + name2);
	}

}
