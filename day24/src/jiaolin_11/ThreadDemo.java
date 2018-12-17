package jiaolin_11;

/**
 * @Auther: Joinlin
 * @Descriptional: 匿名内部类的格式：
 * new 类名或者接口名() {
 * 重写方法;
 * };
 * 本质：是该类或者接口的子类对象。
 * v实现Runnable接口来实现多线程
 * @Date: Create in 16:23 2018/6/27
 * @Modify By:
 */
public class ThreadDemo {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + "===" + x);
				}
			}
		}.start();

	/*	new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + "===" + x);
				}
			}
		}) {

		}.start();*/

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + "===" + x);
				}
			}
		}) {
			@Override
			public void run() {
				for (int x = 100; x < 200; x++) {
					System.out.println(Thread.currentThread().getName() + "===" + x);
				}
			}
		}.start();
	}
}
