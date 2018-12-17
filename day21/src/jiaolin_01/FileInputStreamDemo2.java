package jiaolin_01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther: Joinlin
 * @Descriptional: InputStreamReader(InputStream is):用默认的编码读取数据
 * InputStreamReader(InputStream is,String charsetName):用指定的编码读取数据
 * <p>
 * InputStreamReader的方法：
 * int read():一次读取一个字符
 * int read(char[] chs):一次读取一个字符数组
 * @Date: Create in 10:02 2018/6/22
 * @Modify By:
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream("fos.txt"));
		/*int len=0;
		while ((len=reader.read())!=-1){
			System.out.print((char)len);
		}*/
		char[] chars = new char[1024];
		int len = 0;
		//读取字符数组
		while ((len = reader.read(chars)) != -1) {
			System.out.print(new String(chars,0,len));
		}
	}
}
