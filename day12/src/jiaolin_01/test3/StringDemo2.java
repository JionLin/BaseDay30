package jiaolin_01.test3;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：统计一个字符串中大写字母字符，
 * 小写字母字符，
 * 数字字符出现的次数。(不考虑其他字符)
 * @Date: Create in 10:07 2018/6/8
 * @Modify By:
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s="Hello123World";
		int bigCount=0;
		int smallCount=0;
		int number=0;
		for (int x=0;x<s.length();x++){
			char char2=s.charAt(x);
			if (char2>='0'&&char2<='9'){
				number++;
			}else if(char2>='a' &&char2 <='z'){
				smallCount++;
			}else if(char2>='A' &&char2 <='Z'){
				bigCount++;
			}
		}
		System.out.println(bigCount);
		System.out.println(smallCount);
		System.out.println(number);
	}
}
