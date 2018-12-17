package set_son;

import java.util.HashSet;

/**
 * @Auther: Joinlin
 * @Descriptional: Collection
 * |--List
 * 有序(存储顺序和取出顺序一致),可重复
 * |--Set
 * 无序(存储顺序和取出顺序不一致),唯一
 * <p>
 * HashSet：它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。
 * 注意：虽然Set集合的元素无序，但是，作为集合来说，它肯定有它自己的存储顺序，
 * 而你的顺序恰好和它的存储顺序一致，这代表不了有序，你可以多存储一些数据，就能看到效果。
 * @Date: Create in 8:59 2018/6/15
 * @Modify By:
 */
public class SetDemo1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("hello");
		set.add("hello");
		set.add("hello");
		set.add("我爱你");
		set.add("world");
		set.add("java");
		set.add("java");
		set.add("world");
		set.add("javaee");
		for (String s : set) {
			System.out.println(s);
		}
	}
}
