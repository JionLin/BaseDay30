package ioDemo;

import java.util.Properties;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: 特殊功能：
 * public Object setProperty(String key,String value)：添加元素
 * public String getProperty(String key):获取元素
 * public Set<String> stringPropertyNames():获取所有的键的集合
 * @Date: Create in 15:06 2018/6/25
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) {
		Properties properties=new Properties();
		properties.setProperty("林允","18");
		properties.setProperty("素素","23");
		properties.setProperty("jj","25");
		/*Set<Object> objects = properties.keySet();
		for (Object key:objects){
			System.out.println(key+"---"+properties.getProperty((String) key));
		}*/
		Set<String> set = properties.stringPropertyNames();
		for (String s : set) {
			System.out.println(s+"---"+properties.getProperty(s));
		}
	}
}
