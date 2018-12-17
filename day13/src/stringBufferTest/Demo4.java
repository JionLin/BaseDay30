package stringBufferTest;

/**
 * @Auther: Joinlin
 * @Descriptional: ingBuffer的替换功能：
 * public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
 * @Date: Create in 15:52 2018/6/8
 * @Modify By:
 */
public class Demo4 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hello");
		StringBuffer replace = s1.replace(0, 2, "world");
		System.out.println(replace);
	}
}
