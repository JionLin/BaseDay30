package jiaolin_10;

import java.util.concurrent.Callable;

/**
 * @Auther: Joinlin
 * @Descriptional: 线程求和案例
 * @Date: Create in 15:55 2018/6/27
 * @Modify By:
 */
public class MyCallable implements Callable<Integer> {

	private int number;

	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int x = 1; x <= number; x++) {
			sum += x;
		}
		return sum;
	}
}
