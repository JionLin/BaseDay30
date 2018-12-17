package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther: Joinlin
 * @Descriptional: 数据结构：数据的存储方式。
 * <p>
 * Collection:是集合的顶层接口，它的子体系有重复的，有唯一的，有有序的，有无序的。(后面会慢慢的讲解)
 * <p>
 * Collection的功能概述：
 * 1：添加功能
 * boolean add(Object obj):添加一个元素
 * boolean addAll(Collection c):添加一个集合的元素
 * 2:删除功能
 * void clear():移除所有元素
 * boolean remove(Object o):移除一个元素
 * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
 * 3:判断功能
 * boolean contains(Object o)：判断集合中是否包含指定的元素
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
 * boolean isEmpty()：判断集合是否为空
 * 4:获取功能
 * Iterator<E> iterator()(重点)
 * 5:长度功能
 * int size():元素的个数
 * 面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
 * 6:交集功能
 * boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
 * 7：把集合转换为数组
 * Object[] toArray()
 * @Date: Create in 9:15 2018/6/13
 * @Modify By:
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		//测试不带all的
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");

//		c.clear();
//		c.remove("hello");
//		c.remove("javaee");
//		System.out.println(c.remove("javaee"));
		System.out.println(c);
		System.out.println("contains: "+c.contains("hello"));
		System.out.println("isEmpty: "+c.isEmpty());
		System.out.println("size: "+c.size());
	}
}
