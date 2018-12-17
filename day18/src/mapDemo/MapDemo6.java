package mapDemo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：
 * 假设HashMap集合的元素是ArrayList。有3个。
 * 每一个ArrayList集合的值是字符串。
 * 元素我已经完成，请遍历。
 * 结果：
 * 三国演义
 * 吕布
 * 周瑜
 * 笑傲江湖
 * 令狐冲
 * 林平之
 * 神雕侠侣
 * 郭靖
 * 杨过
 * @Date: Create in 14:57 2018/6/15
 * @Modify By:
 */
public class MapDemo6 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("吕布");
		list1.add("周瑜");
		map.put("三国演义", list1);
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("令狐冲");
		list2.add("林平之");
		map.put("笑傲江湖", list2);

		ArrayList<String> list3 = new ArrayList<>();
		list3.add("郭靖");
		list3.add("杨过");
		map.put("神雕侠侣", list3);
		for (String key : map.keySet()) {
			System.out.println(key);
			ArrayList<String> list = map.get(key);
			for (String s2:list){
				System.out.println(s2);
			}
		}


	}
}
