package generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: Joinlin
 * @Descriptional: ArrayList存储字符串并遍历
 * 去除了黄色警告线
 * 把运行时的问题提前到了编译时期
 * 避免了类型转换
 * @Date: Create in 16:08 2018/6/13
 * @Modify By:
 */
public class GenericDemo1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("java");

		//增强for循环 iter
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("----------");

		//while循环 itit
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		System.out.println("---------");
		//普通for循环 itar
		for (int i = 0; i < list.size(); i++) {
			String s =  list.get(i);
			System.out.println(s);
		}
	}

}
