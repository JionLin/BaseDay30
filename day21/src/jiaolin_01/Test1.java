package jiaolin_01;

import java.io.*;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：把当前项目目录下的fos.txt内容复制到当前项目目录下的fos5.txt中
 * @Date: Create in 10:21 2018/6/22
 * @Modify By:
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		//使用字符流进行复制 数据源 目标源
		InputStreamReader reader=new InputStreamReader(new FileInputStream("fos.txt"));

		OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("fos5.txt"));

		/*char[] chars=new char[1024];
		int len=0;
		while ((len=reader.read(chars))!=-1){
			writer.write(chars,0,len);
			writer.flush();
		}*/

		int len=0;
		while ((len=reader.read())!=-1){
			writer.write(len);
		}
		writer.close();
		reader.close();

	}
}
