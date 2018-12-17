package jiaolin_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
 * @Date: Create in 15:15 2018/6/22
 * @Modify By:
 */
public class Test4 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("fos2.txt"));
		ArrayList<String> list = new ArrayList<>();
		String line = null;
		while ((line = reader.readLine()) != null) {
			list.add(line);
		}
		for (String s : list) {
			System.out.println(s);
		}
		reader.close();
	}
}
