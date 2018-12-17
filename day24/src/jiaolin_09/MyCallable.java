package jiaolin_09;

import java.util.concurrent.Callable;

/**
 * @Auther: Joinlin
 * @Descriptional: Callable:是带泛型的接口。
 * 这里指定的泛型其实是call()方法的返回值类型。
 * @Date: Create in 15:49 2018/6/27
 * @Modify By:
 */
public class MyCallable implements Callable {
	@Override
	public Object call() throws Exception {
		for (int x = 0; x < 100; x++) {
			System.out.println(Thread.currentThread().getName() + "===" + x);
		}
		return null;
	}
}
