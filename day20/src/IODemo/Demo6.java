package IODemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 一次读取一个字节数组：int read(byte[] b)
 * 返回值其实是实际读取的字节个数。
 * @Date: Create in 11:22 2018/6/21
 * @Modify By:
 */
public class Demo6 {
	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream("fos3.txt");
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = stream.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, len));
		}
		stream.close();
	}
}
