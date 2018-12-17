package regexTest;

/**
 * @Auther: Joinlin
 * @Descriptional: 替换功能
 *  	String类的public String replaceAll(String regex,String replacement)
 *  	使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
 * @Date: Create in 10:17 2018/6/12
 * @Modify By:
 */
public class Test8 {
	public static void main(String[] args) {
		String s="helloqq12345worldkh622112345678java";
		String regex="\\d+";
//		String replacement="";
		String replacement="*";
		System.out.println(s.replaceAll(regex,replacement));
	}
}
