package ioDemo;

import java.util.Properties;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: Properties:属性集合类。是一个可以和IO流相结合使用的集合类。
 * Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
 *
 * 是Hashtable的子类，说明是一个Map集合。
 * @Date: Create in 15:03 2018/6/25
 * @Modify By:
 */
public class Demo2 {
	public static void main(String[] args) {
		Properties properties=new Properties();
		properties.put("焦林",18);
		properties.put("林允儿",18);
		properties.put("林允",18);

		Set<Object> set = properties.keySet();
		for (Object key : set) {
			System.out.println(key+"---"+properties.get(key));
		}
	}
}
