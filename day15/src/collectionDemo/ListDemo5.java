package collectionDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: 问题?
 * 我有一个集合，如下，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
 * @Date: Create in 10:34 2018/6/13
 * @Modify By:
 */
public class ListDemo5 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		list.add("world");

		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			if ("world".equals(s)){
				list.add("javaee");
			}
		}
		System.out.println(list);
	}
}
