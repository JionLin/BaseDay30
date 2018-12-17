package set_son;

import java.util.HashSet;
import java.util.Random;

/**
 * @Auther: Joinlin
 * @Descriptional: 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * @Date: Create in 10:18 2018/6/15
 * @Modify By:
 */
public class TreeSetDemo5 {
	public static void main(String[] args) {
		//创建集合
		HashSet<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		while (set.size() < 10) {
			//进行遍历,把随机数也要添加进来
			int result = random.nextInt(20) + 1;
			set.add(result);
		}
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
