package regexTest;

import java.util.Arrays;

/**
 * @Auther: Joinlin
 * @Descriptional: 我有如下一个字符串:"91 27 46 38 50"
 * 请写代码实现最终输出结果是："27 38 46 50 91"
 * 切割成一个字符数组
 * 把字符数组变为int 数组,进行排序
 * 后面在拼接空格符
 * 在去除空格
 * @Date: Create in 9:57 2018/6/12
 * @Modify By:
 */
public class Test7 {
	public static void main(String[] args) {
		String str="91 27 46 38 50";

		String[] strArray = str.split(" ");
		int[] arr=new int[strArray.length];
		//把string数组转换为int数组
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(strArray[i]);
		}
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		String trim = sb.toString().trim();
		System.out.println(trim);


	}
}
