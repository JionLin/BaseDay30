package stringBufferTest;

/**
 * @Auther: Joinlin
 * @Descriptional: * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
 * public String substring(int start) //从start到结尾
 * public String substring(int start,int end)
 * @Date: Create in 15:54 2018/6/8
 * @Modify By:
 */
public class Demo6 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		s1.append("hello").append("world");
//		String substring = s1.substring(5);
//		System.out.println(substring);

		String substring = s1.substring(0, 5);
		System.out.println(substring);
	}
}
