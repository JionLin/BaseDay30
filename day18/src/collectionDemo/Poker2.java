package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @Auther: Joinlin
 * @Descriptional: 模拟斗地主洗牌和发牌
 * 思路：
 * A:创建一个HashMap集合
 * B:创建一个ArrayList集合
 * C:创建花色数组和点数数组
 * D:从0开始往HashMap里面存储编号，并存储对应的牌
 * 同时往ArrayList里面存储编号即可。
 * E:洗牌(洗的是编号)
 * F:发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)
 * G:看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
 * @Date: Create in 16:06 2018/6/19
 * @Modify By:
 */
public class Poker2 {
	public static void main(String[] args) {
		//用来装数字索引和牌 牌盒
		HashMap<Integer, String> map = new HashMap<>();
		//存的是索引
		ArrayList<Integer> list = new ArrayList<>();
		//创建花色数组和点数数组 装牌
		String[] colors = {"♠", "♥", "♣", "♦"};
		String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		int index = 0;
		for (String number : numbers) {
			for (String color : colors) {
				String porker = color.concat(number);
				map.put(index, porker);
				list.add(index);
				index++;
			}
		}
		map.put(index, "小王");
		list.add(index);
		index++;
		map.put(index, "大王");
		list.add(index);

		//洗牌 洗的是编号
		Collections.shuffle(list);

		//造人
		TreeSet<Integer> jiaoLin = new TreeSet<Integer>();
		TreeSet<Integer> linYun = new TreeSet<Integer>();
		TreeSet<Integer> linYunEr = new TreeSet<Integer>();
		TreeSet<Integer> diPai = new TreeSet<Integer>();
		//发牌
		for (int x = 0; x < list.size(); x++) {
			if (x >= list.size() - 3) {
				diPai.add(list.get(x));
			} else if (x % 3 == 0) {
				jiaoLin.add(list.get(x));
			} else if (x % 3 == 1) {
				linYunEr.add(list.get(x));
			} else if (x % 3 == 2) {
				linYun.add(list.get(x));
			}
		}
		//看牌
		lookPorker("焦林", jiaoLin, map);
		lookPorker("林允", linYun, map);
		lookPorker("林允儿", linYunEr, map);
		lookPorker("底牌", diPai, map);
	}

	public static void lookPorker(String name, TreeSet<Integer> list, HashMap<Integer, String> map) {
		System.out.print(name + "的牌是 ");
		for (Integer key : list) {
			String value = map.get(key);
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
