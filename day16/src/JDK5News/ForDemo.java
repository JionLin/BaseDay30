package JDK5News;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Joinlin
 * @Descriptional: JDK5的新特性：自动拆装箱,泛型,增强for,静态导入,可变参数,枚举
 * <p>
 * 增强for:是for循环的一种。
 * <p>
 * 格式：
 * for(元素数据类型 变量 : 数组或者Collection集合) {
 * 使用变量即可，该变量就是元素
 * }
 * @Date: Create in 17:03 2018/6/13
 * @Modify By:
 */
public class ForDemo {
	public static void main(String[] args) {
		//int 数组
		int[] arrs = {12, 23, 22, 24, 3231};
		for (int x : arrs) {
			System.out.println(x);
		}
		System.out.println("-------------");
		//string 数组
		String[] strArray = {"林志玲", "江疏影", "赵丽颖"};
		for (String str : strArray) {
			System.out.println(str);
		}
		System.out.println("-------------");
		//list集合
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		for (String str : list) {
			System.out.println(str);
		}

		//list集合为空
		List<String> list2 = null;
		if (list2.isEmpty()) {
			for (String str : list2) {
				System.out.println(str);
			}
		}
	}
}
