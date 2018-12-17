package stringBufferTest;

/**
 * @Auther: Joinlin
 * @Descriptional: 为什么我们要讲解类之间的转换：
 * A -- B的转换
 * 我们把A转换为B，其实是为了使用B的功能。
 * B -- A的转换
 * 我们可能要的结果是A类型，所以还得转回来。
 * <p>
 * String和StringBuffer的相互转换?
 * @Date: Create in 16:01 2018/6/8
 * @Modify By:
 */
public class Demo7 {
	public static void main(String[] args) {
		//string-->stringbuffer  构造方法  sb.append
		String s1="hello";
		StringBuffer s2=new StringBuffer(s1);
		System.out.println(s2);

		StringBuffer s3=new StringBuffer();
		s3.append(s1);
		System.out.println("s3: "+s3);

		//stringbuffer-->string  tostring  构造方法
		StringBuffer s4=new StringBuffer("world");
		String s5 = s4.toString();
		System.out.println("s5: "+s5);

		String s6=new String(s4);
		System.out.println("s6: "+s6);

	}
}
