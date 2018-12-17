package jiaolin_01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 字节流读取中文可能出现的小问题： 一个字符为2个字节
 * @Date: Create in 9:25 2018/6/22
 * @Modify By:
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream stream=new FileInputStream("fos.txt");
		int len=0;
		/*while ((len=stream.read())!=-1){  可能会出现乱码问题
			System.out.print((char)len);
		}*/
		byte[] bytes=new byte[1024];
		while ((len=stream.read(bytes))!=-1){
			System.out.println(new String(bytes,0,len));
		}
	}
}
