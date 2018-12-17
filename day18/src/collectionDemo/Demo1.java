package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: v Collections:是针对集合进行操作的工具类，都是静态方法。
 * <p>
 * 面试题：
 * Collection和Collections的区别?
 * Collection:是单列集合的顶层接口，有子接口List和Set。
 * Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
 * <p>
 * 要知道的方法
 * public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
 * public static <T> int binarySearch(List<?> list,T key):二分查找
 * public static <T> T max(Collection<?> coll):最大值
 * public static void reverse(List<?> list):反转
 * public static void shuffle(List<?> list):随机置换
 * @Date: Create in 11:27 2018/6/19
 * @Modify By:
 */
public class Demo1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(100);
		list.add(70);
//		Collections.sort(list);
//		System.out.println(list);

//		int result = Collections.binarySearch(list, 100);
//		System.out.println(result);

//		Integer max = Collections.max(list);
//		System.out.println(max);

//		Collections.reverse(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
}
