package stringBufferTest;

/**
 * @Auther: Joinlin
 * @Descriptional: StringBuffer的添加功能：
 * public StringBuffer append(String str):可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
 *
 * public StringBuffer insert(int offset,String str):在指定位置把任意类型的数据插入到字符串缓冲区里面,
 * 并返回字符串缓冲区本身
 * @Date: Create in 15:28 2018/6/8
 * @Modify By:
 */
public class Demo2 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hello");
		StringBuffer s2=new StringBuffer("world");
		StringBuffer append = s1.append(s2);
		System.out.println(append);
		StringBuffer insert = append.insert(2, "000");
		System.out.println(insert);
	}
}
