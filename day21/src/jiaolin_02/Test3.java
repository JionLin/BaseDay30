package jiaolin_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：把ArrayList集合中的字符串数据存储到文本文件
 * @Date: Create in 15:10 2018/6/22
 * @Modify By:
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("java");

		BufferedWriter writer = new BufferedWriter(new FileWriter("fos2.txt"));
		for (String s : list) {
			writer.write(s);
			writer.newLine();
		}
		writer.close();
	}
}
