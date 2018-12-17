package stringBufferTest;

/**
 * @Auther: Joinlin
 * @Descriptional: StringBuffer的反转功能：
 * public StringBuffer reverse()
 * @Date: Create in 15:53 2018/6/8
 * @Modify By:
 */
public class Demo5 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("helloworld");
		StringBuffer reverse = s1.reverse();
		System.out.println(reverse);
	}
}
