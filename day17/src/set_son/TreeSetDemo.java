package set_son;

import javax.sound.midi.Soundbank;
import java.util.TreeSet;

/**
 * @Auther: Joinlin
 * @Descriptional: TreeSet：能够对元素按照某种规则进行排序。
 * 排序有两种方式
 * A:自然排序
 * B:比较器排序
 * <p>
 * TreeSet集合的特点：排序和唯一
 * <p>
 * 通过观察TreeSet的add()方法，我们知道最终要看TreeMap的put()方法。
 * @Date: Create in 9:32 2018/6/15
 * @Modify By:
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(28);
		set.add(23);
		set.add(24);
		set.add(20);
		set.add(29);
		set.add(20);
		set.add(30);
		set.add(40);
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
