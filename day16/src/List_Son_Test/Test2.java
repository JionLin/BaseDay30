package List_Son_Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Auther: Joinlin
 * @Descriptional: 获取10个1-20之间的随机数，要求不能重复
 * <p>
 * 用数组实现，但是数组的长度是固定的，长度不好确定。
 * 所以我们使用集合实现。
 * <p>
 * 分析：
 * A:创建产生随机数的对象
 * B:创建一个存储随机数的集合。
 * C:定义一个统计变量。从0开始。
 * D:判断统计遍历是否小于10
 * 是:先产生一个随机数，判断该随机数在集合中是否存在。
 * 如果不存在:就添加，统计变量++。
 * 如果存在:就不搭理它。
 * 否：不搭理它
 * E:遍历集合
 * @Date: Create in 10:28 2018/6/14
 * @Modify By:
 */
public class Test2 {
	public static void main(String[] args) {
		//获取10个1-20之间的随机数，要求不能重复
		ArrayList<Integer> list = new ArrayList<Integer>();

		int count = 0;
		while (count < 10) {
			Random random = new Random();
			int number = random.nextInt(20) + 1;
			if (!list.contains(number)) {
				list.add(number);
				count++;
			}
		}
		for (int x:list){
			System.out.println(x);
		}
	}
}
