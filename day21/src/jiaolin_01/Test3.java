package jiaolin_01;

import java.io.*;

/**
 * @Auther: Joinlin
 * @Descriptional: * 需求：把当前项目目录下的fos3.txt内容复制到当前项目目录下的fos4.txt中
 * @Date: Create in 10:52 2018/6/22
 * @Modify By:
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
//		reader1();
		writer1();
	}

	private static void writer1() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("fos3.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("fos2.txt"));
		String line = null;
		char[] chars = new char[1024];
		while ((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		writer.close();
		reader.close();
	}

	private static void reader1() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("fos3.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("fos.txt"));
		int len = 0;
		char[] chars = new char[1024];
		while ((len = reader.read(chars)) != -1) {
			writer.write(chars, 0, len);
			writer.flush();
		}
		writer.close();
		reader.close();

	}
}
