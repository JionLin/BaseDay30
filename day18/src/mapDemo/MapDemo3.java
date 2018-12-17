package mapDemo;

import java.util.LinkedHashMap;

/**
 * @Auther: Joinlin
 * @Descriptional: LinkedHashMap:是Map接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 * 由哈希表保证键的唯一性
 * 由链表保证键盘的有序(存储和取出的顺序一致)
 * @Date: Create in 11:45 2018/6/15
 * @Modify By:
 */
public class MapDemo3 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer>map=new LinkedHashMap<String, Integer>();
		map.put("林志玲",18);
		map.put("林允儿",19);
		map.put("林志颖",20);
		map.put("林志玲",19);
		System.out.println(map);
	}
}
