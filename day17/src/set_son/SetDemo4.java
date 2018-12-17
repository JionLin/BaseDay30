package set_son;

import java.util.LinkedHashSet;

/**
 * @Auther: Joinlin
 * @Descriptional: LinkedHashSet:底层数据结构由哈希表和链表组成。
 * 哈希表保证元素的唯一性。
 * 链表保证元素有素。(存储和取出是一致)
 * @Date: Create in 9:24 2018/6/15
 * @Modify By:
 */
public class SetDemo4 {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("javaee");
		set.add("hello");
		for (String s : set) {
			System.out.println(s);
		}
	}
}

