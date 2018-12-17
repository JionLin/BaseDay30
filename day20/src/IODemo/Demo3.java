package IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 字节输出流操作步骤：
 * A:创建字节输出流对象
 * B:调用write()方法
 * C:释放资源
 *
 * public void write(int b):写一个字节
 * public void write(byte[] b):写一个字节数组
 * public void write(byte[] b,int off,int len):写一个字节数组的一部分
 * @Date: Create in 10:43 2018/6/21
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) throws IOException{
		FileOutputStream stream=new FileOutputStream("fos2.txt");
//		stream.write(97);
		byte[] bytes={97,98,99,100};
		stream.write(bytes);
		stream.write(bytes,1,2);
		stream.close();
	}
}
