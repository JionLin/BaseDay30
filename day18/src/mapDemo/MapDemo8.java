package mapDemo;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Auther: Joinlin
 * @Descriptional: * 1:Hashtable和HashMap的区别?
 * Hashtable:线程安全，效率低。不允许null键和null值
 * HashMap:线程不安全，效率高。允许null键和null值
 * <p>
 * 2:List,Set,Map等接口是否都继承子Map接口?
 * List，Set不是继承自Map接口，它们继承自Collection接口
 * Map接口本身就是一个顶层接口
 * @Date: Create in 17:28 2018/6/15
 * @Modify By:
 */
public class MapDemo8 {
	public static void main(String[] args) {
//		HashMap<String,String> map=new HashMap<>();
		Hashtable<String,String> map=new Hashtable<>();
		map.put("林志玲",null);
		map.put(null,"林志玲");
		System.out.println(map);
	}
}
