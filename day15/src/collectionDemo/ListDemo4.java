package collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Auther: Joinlin
 * @Descriptional: * List集合的特有功能：
 * A:添加功能
 * void add(int index,Object element):在指定位置添加元素
 * B:获取功能
 * Object get(int index):获取指定位置的元素
 * C:列表迭代器
 * ListIterator listIterator()：List集合特有的迭代器
 * D:删除功能
 * Object remove(int index)：根据索引删除元素,返回被删除的元素
 * E:修改功能
 * Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
 * @Date: Create in 10:22 2018/6/13
 * @Modify By:
 */
public class ListDemo4 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
//		list.add(4,"javaee");
//		String o = (String) list.get(4);
//		System.out.println(o);
		/*ListIterator iterator = list.listIterator();
		while (iterator.hasNext()){
			String s=(String)iterator.next();
			System.out.println(s);
		}*/
//
//		System.out.println(list);
//		String remove = (String) list.remove(2);
//		System.out.println("remove: "+remove);
		System.out.println(list);

		// * Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
		list.set(1,"javaee");
		System.out.println(list);
	}
}
