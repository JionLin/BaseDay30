package day18_porker;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @Auther: Joinlin
 * @Descriptional: 模拟扑克牌
 * 创建牌盒 使用Arraylist
 * 装牌
 * 洗牌
 * 发牌
 * 看牌 调用hashMap  Treeset 需要排序
 * @Date: Create in 16:35 2018/6/20
 * @Modify By:
 */
public class Porker {
	public static void main(String[] args) {
		//装牌
		HashMap<Integer, String> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		String[] colors = {"♠", "♥", "♣", "♦" };
		String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
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

		Collections.shuffle(list);
		TreeSet<Integer> diPai = new TreeSet<>();
		TreeSet<Integer> jiaoLin = new TreeSet<>();
		TreeSet<Integer> linYun = new TreeSet<>();
		TreeSet<Integer> reBa = new TreeSet<>();
		for (int x = 0; x < list.size(); x++) {
			if (x >= list.size() - 3) {
				diPai.add(list.get(x));
			} else if (x % 3 == 0) {
				jiaoLin.add(list.get(x));
			} else if (x % 3 == 1) {
				linYun.add(list.get(x));
			} else if (x % 3 == 2) {
				reBa.add(list.get(x));
			}
		}
		lookPorker("底牌",diPai,map);
		lookPorker("焦林",jiaoLin,map);
		lookPorker("林允",linYun,map);
		lookPorker("热巴",reBa,map);
	}

	private static void lookPorker(String name, TreeSet<Integer> set, HashMap<Integer, String> map) {
		System.out.print(name+"的牌是 ");
		for (Integer integer : set) {
			String value = map.get(integer);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
