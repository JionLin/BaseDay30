package list_son;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
 * 要求：不能创建新的集合，就在以前的集合上做。
 * @Date: Create in 11:04 2018/6/13
 * @Modify By:
 */
public class ListDemo2 {
	public static void main(String[] args) {
		ArrayList oldList = new ArrayList();
		oldList.add("hello");
		oldList.add("world");
		oldList.add("world");
		oldList.add("world");
		oldList.add("java");
		oldList.add("java");
		oldList.add("java");
		oldList.add("java");

		//选择排序
		for (int x = 0; x < oldList.size() - 1; x++) {
			for (int y = x + 1; y < oldList.size(); y++) {
				if (oldList.get(x).equals(oldList.get(y))){
					oldList.remove(y);
					y--;
				}
			}
		}

		Iterator iterator = oldList.iterator();
		while (iterator.hasNext()) {
			String next = (String) iterator.next();
			System.out.println(next);

		}


	}
}
