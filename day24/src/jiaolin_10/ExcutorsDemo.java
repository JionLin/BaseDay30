package jiaolin_10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Auther: Joinlin
 * @Descriptional: A:创建一个线程池对象，控制要创建几个线程对象。
 * public static ExecutorService newFixedThreadPool(int nThreads)
 * B:这种线程池的线程可以执行：
 * 可以执行Runnable对象或者Callable对象代表的线程
 * 做一个类实现Runnable接口。
 * C:调用如下方法即可
 * Future<?> submit(Runnable task)
 * <T> Future<T> submit(Callable<T> task)
 * D:我就要结束，可以吗?
 * 可以。
 * @Date: Create in 15:55 2018/6/27
 * @Modify By:
 */
public class ExcutorsDemo {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		//创建线程池
		ExecutorService pool = Executors.newFixedThreadPool(2);
		//进行执行线程
		Future<Integer> sum1 = pool.submit(new MyCallable(100));
		Future<Integer> sum2 = pool.submit(new MyCallable(200));

		Integer i1 = sum1.get();
		Integer i2 = sum2.get();
		System.out.println("i1: " + i1 + " i2: " + i2);
		pool.shutdown();
	}
}
