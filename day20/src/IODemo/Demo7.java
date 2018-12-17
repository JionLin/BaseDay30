package IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：把c:\\unintall.log内容复制到d:\\unintall.log中
 * <p>
 * 数据源：
 * c:\\a.txt	--	读取数据	--	FileInputStream
 * 目的地：
 * d:\\b.txt	--	写出数据	--	FileOutputStream
 * @Date: Create in 11:42 2018/6/21
 * @Modify By:
 */
public class Demo7 {
	public static void main(String[] args) throws IOException {
		//读取目标源数据
		FileInputStream fis = new FileInputStream("c:\\unintall.log");

		//写出到数据源数据
		FileOutputStream fos = new FileOutputStream("d:\\unintall.log");

		int len = 0;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}
		fis.close();
		fos.close();
	}
}
