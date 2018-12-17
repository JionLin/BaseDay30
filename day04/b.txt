package jiaolin_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Auther: Joinlin
 * @Descriptional: OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
 * OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流
 * 把字节流转换为字符流。
 * 字符流 = 字节流 +编码表。
 *
 * OutputStreamWriter的方法：
 * public void write(int c):写一个字符
 * public void write(char[] cbuf):写一个字符数组
 * public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
 * public void write(String str):写一个字符串
 * public void write(String str,int off,int len):写一个字符串的一部分
 *
 * 面试题：close()和flush()的区别?
 * A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
 * B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
 * @Date: Create in 10:10 2018/6/22
 * @Modify By:
 */
public class FileOutPutStreamDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("fos.txt"),"utf8");
//		writer.write("你好,中国");
//		char[] chars={'a','b','c','d'};
//		writer.write(97);
//		writer.write(chars);
//		writer.write(chars,1,2);
		String s="你好中国";
		writer.write(s,0,2);
		writer.flush();
		writer.close();
	}
}
