package mapDemo;

import java.util.HashMap;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: HashMap嵌套HashMap
 * <p>
 * 传智播客
 * jc	基础班
 * 陈玉楼		20
 * 高跃		22
 * jy	就业班
 * 李杰		21
 * 曹石磊		23
 * <p>
 * 先存储元素，然后遍历元素
 * @Date: Create in 13:14 2018/6/15
 * @Modify By:
 */
public class MapDemo5 {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, Integer>> map = new HashMap<String, HashMap<String, Integer>>();
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("陈玉楼", 20);
		hashMap.put("高跃", 22);
		map.put("jc", hashMap);

		HashMap<String, Integer> hashMap2 = new HashMap<>();
		hashMap2.put("李杰", 21);
		hashMap2.put("曹石磊", 23);
		map.put("jy", hashMap2);

		Set<String> set = map.keySet();
		for (String key : set) {
			HashMap<String, Integer> hashMap1 = map.get(key);
			Set<String> set1 = hashMap1.keySet();
			for (String key2 : set1) {
				Integer value = hashMap1.get(key2);
				System.out.println(key + "----" + key2 + "---" + value);
			}
		}
	}
}
