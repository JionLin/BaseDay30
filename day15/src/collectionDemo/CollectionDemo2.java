package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther: Joinlin
 * @Descriptional: * Collection的功能概述：
 * 1：添加功能
 * boolean add(Object obj):添加一个元素
 * boolean addAll(Collection c):添加一个集合的元素 添加arrayList  返回true 说明可以重复
 * 2:删除功能
 * void clear():移除所有元素
 * boolean remove(Object o):移除一个元素
 * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有) 一个
 * 3:判断功能
 * boolean contains(Object o)：判断集合中是否包含指定的元素
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有) 所有
 * boolean isEmpty()：判断集合是否为空
 * 4:获取功能
 * Iterator<E> iterator()(重点)
 * 5:长度功能
 * int size():元素的个数
 * 面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
 * 6:交集功能
 * boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
 * 7：把集合转换为数组
 *  * Object[] toArray()
 * @Date: Create in 9:30 2018/6/13
 * @Modify By:
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// 创建集合2
		Collection c2 = new ArrayList();
//		c2.add("abc1");
//		c2.add("abc2");
//		c2.add("abc3");
//		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");


//		System.out.println("addAll: "+c1.addAll(c2));
//		System.out.println(c1.removeAll(c2));
		System.out.println(c1);
		System.out.println(c2);
//		System.out.println("containsAll "+c1.containsAll(c2));
		System.out.println("retainAll: "+c1.retainAll(c2));


	}
}
