package jiaolin_01.test5;

/**
 * @Auther: Joinlin
 * @Descriptional: 统计大串中小串出现的次数
 * @Date: Create in 14:29 2018/6/8
 * @Modify By:
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		int in = maxString.indexOf(minString);
//		System.out.println(in);
		System.out.println("-----------------------");
		int sum = getSum(maxString, minString);
		System.out.println(sum);
	}

	public static int getSum(String maxString, String minString) {
		int count = 0;
		int index = maxString.indexOf(minString);
		/*while ((index = maxString.indexOf(minString)) != -1) {
			count++;
			maxString = maxString.substring(index + minString.length());
		}*/
		while (index != -1) {
			count++;
			maxString=maxString.substring(index+minString.length());
			index=maxString.indexOf(minString);
		}
		return count;
	}
}
