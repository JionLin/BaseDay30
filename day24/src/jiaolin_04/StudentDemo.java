package jiaolin_04;

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
 * <p>
 * 问题2：为了数据的效果好一些，我加入了循环和判断，给出不同的值,这个时候产生了新的问题
 * A:同一个数据出现多次
 * B:姓名和年龄不匹配
 * 原因：
 * A:同一个数据出现多次
 * CPU的一点点时间片的执行权，就足够你执行很多次。
 * B:姓名和年龄不匹配
 * 线程运行的随机性
 * 线程安全问题：
 * A:是否是多线程环境		是
 * B:是否有共享数据		是
 * C:是否有多条语句操作共享数据	是
 * 解决方案：
 * 加锁。
 * 注意：
 * A:不同种类的线程都要加锁。
 * B:不同种类的线程加的锁必须是同一把。
 * @Date: Create in 10:44 2018/6/27
 * @Modify By:
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建对象
		Student student = new Student();
		//创建和获取的类
		GetThread gg = new GetThread(student);
		SetThread ss = new SetThread(student);
		//创建线程
		Thread s1 = new Thread(gg);
		Thread s2 = new Thread(ss);
		s1.start();
		s2.start();
	}
}
