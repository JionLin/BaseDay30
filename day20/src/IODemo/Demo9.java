package IODemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 注意：虽然我们有两种方式可以读取，但是，请注意，这两种方式针对同一个对象在一个代码中只能使用一个。
 * @Date: Create in 12:32 2018/6/21
 * @Modify By:
 */
public class Demo9 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream stream = new BufferedInputStream(new FileInputStream("fos2.txt"));
		/*int len = 0;
		while ((len = stream.read()) != -1) {
			System.out.println((char) len);
		}*/
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = stream.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}
		stream.close();
	}
}
