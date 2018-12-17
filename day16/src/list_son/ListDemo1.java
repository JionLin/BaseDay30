package list_son;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @Auther: Joinlin
 * @Descriptional: ArrayList去除集合中字符串的重复值(字符串的内容相同)
 * //两种方法,第一种,创建一个新集合,如果不包含就添加进来
 * //第二种,第一个和后面的一次比较,相同则删除
 * @Date: Create in 10:52 2018/6/13
 * @Modify By:
 */
public class ListDemo1 {
	public static void main(String[] args) {
		ArrayList oldList = new ArrayList();
		oldList.add("hello");
		oldList.add("world");
		oldList.add("world");
		oldList.add("java");
		oldList.add("java");
		oldList.add("java");

		ArrayList newList = new ArrayList();
		for (int i = 0; i < oldList.size(); i++) {
			String s = (String) oldList.get(i);
			if (!newList.contains(s)) {
				newList.add(s);
			}
		}
		System.out.println(newList);

	}
}
