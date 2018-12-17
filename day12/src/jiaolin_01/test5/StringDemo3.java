package jiaolin_01.test5;

/**
 * @Auther: Joinlin
 * @Descriptional: * 统计大串中小串出现的次数
 * 举例：
 * 在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * @Date: Create in 14:06 2018/6/8
 * @Modify By:
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		int sum = getSum(maxString, minString);
		System.out.println(sum);
	}

	public static int getSum(String maxString, String minString) {
		int count = 0;
		int index = maxString.indexOf(minString);
		while (index != -1) {
			count++;
			int start = index + minString.length();
			maxString = maxString.substring(start);
			index=maxString.indexOf(minString);
		}
		return count;
	}

}
