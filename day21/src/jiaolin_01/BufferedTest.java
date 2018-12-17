package jiaolin_01;

import java.io.*;

/**
 * @Auther: Joinlin
 * @Descriptional: 字符缓冲流的特殊方法：
 * BufferedWriter:
 * public void newLine():根据系统来决定换行符
 * BufferedReader:
 * public String readLine()：一次读取一行数据
 * 包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 * @Date: Create in 10:35 2018/6/22
 * @Modify By:
 */
public class BufferedTest {
	public static void main(String[] args) throws IOException {

//		reader();
		writer();

	}

	//进行写的话,
	private static void writer() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("fos3.txt"));
		for (int x = 0; x < 10; x++) {
			writer.write("hello " + x);
			writer.newLine();
			writer.flush();
		}
		writer.close();
	}

	private static void reader() throws IOException {
		//进行读取和写出
		BufferedReader reader = new BufferedReader(new FileReader("fos3.txt"));
		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
