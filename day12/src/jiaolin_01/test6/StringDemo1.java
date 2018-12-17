package jiaolin_01.test6;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：
 * int[] arr = {1,2,3};
 * 输出结果：
 * "[1, 2, 3]"
 * @Date: Create in 11:15 2018/6/8
 * @Modify By:
 */
public class StringDemo1 {
	public static void main(String[] args) {
		int[] arrs = {1, 2, 3};
		String result = arrToString(arrs);
		System.out.println(result);
	}

	public static String arrToString(int[] arrs) {
		String s = "";
		s += "[";
		for (int x = 0; x < arrs.length; x++) {
			if (x == arrs.length - 1) {
				s += arrs[x];
			} else {
				s += arrs[x];
				s += ", ";
			}
		}
		s += "]";
		return s;
	}

}
