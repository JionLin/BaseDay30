package mapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: Map集合的特点：
 * 将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
 * <p>
 * Map集合和Collection集合的区别?
 * Map集合存储元素是成对出现的，Map集合的键是唯一的，值是可重复的。可以把这个理解为：夫妻对
 * Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是可重复的。可以把这个理解为：光棍(11.11)
 * <p>
 * 注意：
 * Map集合的数据结构值针对键有效，跟值无关
 * HashMap，TreeMap等会讲。
 * Collection集合的数据结构是针对元素有效
 * <p>
 * Map集合的功能概述：
 * 1:添加功能
 * V put(K key,V value):添加元素。这个其实还有另一个功能?先不告诉你，等会讲
 * 如果键是第一次存储，就直接存储元素，返回null
 * 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
 * 2:删除功能
 * void clear():移除所有的键值对元素
 * V remove(Object key)：根据键删除键值对元素，并把值返回
 * 3:判断功能
 * boolean containsKey(Object key)：判断集合是否包含指定的键
 * boolean containsValue(Object value):判断集合是否包含指定的值
 * boolean isEmpty()：判断集合是否为空
 * 4:获取功能
 * Set<Map.Entry<K,V>> entrySet():
 * 转换：
 * A:获取所有键值对对象的集合
 * B:遍历键值对对象的集合，得到每一个键值对对象
 * C:根据键值对对象获取键和值
 * V get(Object key):根据键获取值
 * Set<K> keySet():获取集合中所有键的集合
 * 转换：
 * A:获取所有的键
 * B:遍历键的集合，获取得到每一个键
 * C:根据键去找值
 * Collection<V> values():获取集合中所有值的集合
 * 5：长度功能
 * int size()：返回集合中的键值对的对数
 * @Date: Create in 11:01 2018/6/15
 * @Modify By:
 */
public class MapDemo1 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("林志玲", "黄渤");
		map.put("杨过", "小龙女");
		map.put("杨过", "面包脸");
		map.put("杨颖", "黄晓明");
		map.put("邓超", "孙俪");
//		map.clear();
//		System.out.println(map);
//		System.out.println("remove: "+map.remove("邓超"));
//		System.out.println("containsKey: "+map.containsKey("林志玲"));
//		System.out.println("containsValue: "+map.containsValue("面包脸"));
//		System.out.println("isEmpty: "+map.isEmpty());
		/*Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String,String> map2:set){
			String key = map2.getKey();
			String value = map2.getValue();
			System.out.println(key+"---"+value);
		}*/
//		System.out.println("get: "+map.get("杨过"));

		//先通过keySet获取key的集合,把集合进行遍历,根据每一个key拿到每一个值
	/*	Set<String> set = map.keySet();
		for (String key : set) {
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}*/
		/*Collection<String> values = map.values();
		for (String s:values){
			System.out.println(s);
		}*/
		System.out.println(map.size());
	}
}
