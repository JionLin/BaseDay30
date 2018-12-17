package jiaolin_05;

/**
 * @Auther: Joinlin
 * @Descriptional: 方式2：实现Runnable接口
 * 步骤：
 * 		A:自定义类MyRunnable实现Runnable接口
 * 		B:重写run()方法
 * 		C:创建MyRunnable类的对象
 * 		D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
 * @Date: Create in 10:52 2018/6/26
 * @Modify By:
 */
public class MyRunableDemo  {
	public static void main(String[] args) {
		MyRunable my1=new MyRunable();
		Thread t1=new Thread(my1,"jj");
		Thread t2=new Thread(my1,"ss");
		t1.start();
		t2.start();


	}
}
