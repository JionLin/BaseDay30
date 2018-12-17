package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: List集合的特点：
 * 有序(存储和取出的元素一致)，可重复的。
 * @Date: Create in 10:14 2018/6/13
 * @Modify By:
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("i");
		list.add("qu");
		list.add("ni");
		list.add("da");
		list.add("ye");

		Iterator iterator = list.iterator();
		while (iterator.hasNext()){
			String s=(String)iterator.next();
			System.out.println(s);
		}
	}
}
