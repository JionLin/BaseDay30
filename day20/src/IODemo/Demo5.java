package IODemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: * 字节输入流操作步骤：
 * A:创建字节输入流对象
 * B:调用read()方法读取数据，并把数据显示在控制台
 * C:释放资源
 *
 * 读取数据的方式：
 * A:int read():一次读取一个字节
 * B:int read(byte[] b):一次读取一个字节数组
 * @Date: Create in 11:05 2018/6/21
 * @Modify By:
 */
public class Demo5 {
	public static void main(String[] args) throws IOException{
		FileInputStream stream=new FileInputStream("fos2.txt");
		int by=0;
		while ((by=stream.read())!=-1){
			System.out.println((char)by);
		}
		stream.close();
	}
}
