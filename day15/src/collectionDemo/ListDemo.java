package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：List集合存储字符串并遍历。
 * @Date: Create in 10:13 2018/6/13
 * @Modify By:
 */
public class ListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("java");

		Iterator iterator = list.iterator();
		while (iterator.hasNext()){
			String  s=(String )iterator.next();
			System.out.println(s);
		}
	}
}
