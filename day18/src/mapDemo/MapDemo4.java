package mapDemo;

import java.util.HashMap;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: TreeMap:是基于红黑树的Map接口的实现。
 * <p>
 * HashMap<String,String>
 * 键：String
 * 值：String
 * @Date: Create in 12:25 2018/6/15
 * @Modify By:
 */
public class MapDemo4 {
	public static void main(String[] args) {
		HashMap<String, String> tm = new HashMap<>();
		// 创建元素并添加元素
		tm.put("hello", "你好");
		tm.put("world", "世界");
		tm.put("java", "爪哇");
		tm.put("world", "世界2");
		tm.put("javaee", "爪哇EE");
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "----" + value);
		}
	}
}
