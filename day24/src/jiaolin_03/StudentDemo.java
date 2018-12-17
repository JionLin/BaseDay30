package jiaolin_03;

/**
 * @Auther: Joinlin
 * @Descriptional: 分析：
 * 资源类：Student
 * 设置学生数据:SetThread(生产者)
 * 获取学生数据：GetThread(消费者)
 * 测试类:StudentDemo
 * <p>
 * 问题1：按照思路写代码，发现数据每次都是:null---0
 * 原因：我们在每个线程中都创建了新的资源,而我们要求的时候设置和获取线程的资源应该是同一个
 * 如何实现呢?
 * 在外界把这个数据创建出来，通过构造方法传递给其他的类。
 * @Date: Create in 9:22 2018/6/27
 * @Modify By:
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建资源
		Student s = new Student();

		//生产者
		GetThread gt = new GetThread(s);
		//消费者
		SetThread st = new SetThread(s);

		//设置线程类
		Thread t1 = new Thread(gt);
		Thread t2 = new Thread(st);

		t1.start();
		t2.start();

	}
}
