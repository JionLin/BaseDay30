package mapDemo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求 ："aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 * <p>
 * 分析：
 * A:定义一个字符串(可以改进为键盘录入)
 * B:定义一个TreeMap集合
 * 键:Character
 * 值：Integer
 * C:把字符串转换为字符数组
 * D:遍历字符数组，得到每一个字符
 * E:拿刚才得到的字符作为键到集合中去找值，看返回值
 * 是null:说明该键不存在，就把该字符作为键，1作为值存储
 * 不是null:说明该键存在，就把值加1，然后重写存储该键和值
 * F:定义字符串缓冲区变量
 * G:遍历集合，得到键和值，进行按照要求拼接
 * H:把字符串缓冲区转换为字符串输出
 * <p>
 * 录入：linqingxia
 * 结果：result:a(1)g(1)i(3)l(1)n(2)q(1)x(1)
 * @Date: Create in 15:11 2018/6/15
 * @Modify By:
 */
public class MapDemo7 {
	public static void main(String[] args) {
		TreeMap<Character, Integer> map = new TreeMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = scanner.nextLine();

		char[] chars = str.toCharArray();
		//进行for循环遍历,数组和collection集合的遍历
		for (char ch : chars) {
			//从开始得到每一个字符的次数
			Integer count = map.get(ch);

			if (count == null) {
				map.put(ch, 1);
			} else {
				count++;
				map.put(ch, count);
			}
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = map.keySet();
		for (Character key : set) {
			Integer value = map.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		String s = sb.toString();
		System.out.println(s);
	}
}
