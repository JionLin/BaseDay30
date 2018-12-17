package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 加入异常处理的字节输出流操作
 * @Date: Create in 11:00 2018/6/21
 * @Modify By:
 */
public class Demo4 {
	public static void main(String[] args) {
		FileOutputStream stream=null;
		try {
			stream=new FileOutputStream("fos4.txt");
			stream.write(97);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (stream!=null){
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
