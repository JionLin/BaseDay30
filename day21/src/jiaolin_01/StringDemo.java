package jiaolin_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Auther: Joinlin
 * @Descriptional: String(byte[] bytes, String charsetName):通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName):使用指定的字符集合把字符串编码为字节数组
 * <p>
 * 编码:把看得懂的变成看不懂的
 * String -- byte[]
 * <p>
 * 解码:把看不懂的变成看得懂的
 * byte[] -- String
 * <p>
 * 举例：谍战片(发电报，接电报)
 * <p>
 * 码表：小本子
 * 字符	数值
 * <p>
 * 要发送一段文字：
 * 今天晚上在老地方见
 * <p>
 * 发送端：今 -- 数值 -- 二进制 -- 发出去
 * 接收端：接收 -- 二进制 -- 十进制 -- 数值 -- 字符 -- 今
 * <p>
 * 今天晚上在老地方见
 * <p>
 * 编码问题简单，只要编码解码的格式是一致的。
 * @Date: Create in 9:33 2018/6/22
 * @Modify By:
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String s = "中国,你好";
//		byte[] bytes = s.getBytes();
		byte[] bytes = s.getBytes("utf-8");
		System.out.println(Arrays.toString(bytes));
//		String ss=new String(bytes);
		String ss=new String(bytes,"utf-8");
		System.out.println(ss);
	}
}
