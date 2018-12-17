package stringBufferTest;

/**
 * @Auther: Joinlin
 * @Descriptional: * StringBuffer的删除功能
 * public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
 * public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
 * @Date: Create in 15:48 2018/6/8
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hello");
		StringBuffer deleteCharAt = s1.deleteCharAt(1);
		System.out.println(deleteCharAt);

		StringBuffer delete = s1.delete(1, 4);
		System.out.println(delete);
	}
}
