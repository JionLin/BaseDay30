package IODemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 输出流 写出  BufferedOutputStream
 * @Date: Create in 12:42 2018/6/21
 * @Modify By:
 */
public class Demo10 {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("fos.txt"));
		int len = 0;
		stream.write("hellojava".getBytes());
		stream.close();
	}
}
