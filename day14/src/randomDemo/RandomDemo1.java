package randomDemo;

import java.util.Random;

/**
 * @Auther: Joinlin
 * @Descriptional: Random:产生随机数的类
 * <p>
 * 构造方法：
 * public Random():没有给种子，用的是默认种子，是当前时间的毫秒值
 * public Random(long seed):给出指定的种子
 * <p>
 * 给定种子后，每次得到的随机数是相同的。
 * <p>
 * 成员方法：
 * public int nextInt()：返回的是int范围内的随机数
 * public int nextInt(int n):返回的是[0,n)范围的内随机数
 * @Date: Create in 11:11 2018/6/12
 * @Modify By:
 */
public class RandomDemo1 {
	public static void main(String[] args) {
//		Random r = new Random();
		Random r = new Random(111);
		for (int x = 0; x < 10; x++) {
//			int result = r.nextInt();
			int result = r.nextInt(100)+1;
			System.out.println(result);
		}
	}
}
