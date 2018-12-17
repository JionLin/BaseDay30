package JDK5News;


import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: public static <T> List<T> asList(T... a):把数组转成集合
 * 注意事项：
 * 虽然可以把数组转成集合，但是集合的长度不能改变。
 * @Date: Create in 9:19 2018/6/14
 * @Modify By:
 */
public class ArraysDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello", "world", "java");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()){
			String s = iterator.next();
			System.out.println(s);
		}
		System.out.println("--------------------");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
