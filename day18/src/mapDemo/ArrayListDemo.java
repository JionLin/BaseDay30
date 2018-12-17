package mapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: ArrayList集合嵌套HashMap集合并遍历。
 * 需求：
 * 假设ArrayList集合的元素是HashMap。有3个。
 * 每一个HashMap集合的键和值都是字符串。
 * 元素我已经完成，请遍历。
 * 结果：
 * 周瑜---小乔
 * 吕布---貂蝉
 * <p>
 * 郭靖---黄蓉
 * 杨过---小龙女
 * <p>
 * 令狐冲---任盈盈
 * 林平之---岳灵珊
 * @Date: Create in 12:51 2018/6/15
 * @Modify By:
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map = new HashMap<>();
		map.put("周瑜", "小乔");
		map.put("吕布", "貂蝉");
		list.add(map);

		HashMap<String, String> map2 = new HashMap<>();
		map2.put("郭靖", "黄蓉");
		map2.put("杨过", "小龙女");
		list.add(map2);

		HashMap<String, String> map3 = new HashMap<>();
		map3.put("令狐冲", "任盈盈");
		map3.put("林平之", "岳灵珊");
		list.add(map3);

		for (HashMap<String, String> hashMap : list) {
			Set<String> set = hashMap.keySet();
			for (String key:set){
				String value = hashMap.get(key);
				System.out.println(key+"---"+value);
			}
		}

	}
}
