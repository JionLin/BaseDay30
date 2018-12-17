package jiaolin_02;

import java.io.*;
import java.util.Arrays;

/**
 * @Auther: Joinlin
 * @Descriptional: 已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
 * 请编写程序读取数据内容，把数据排序后写入ss.txt中。
 * @Date: Create in 10:51 2018/6/25
 * @Modify By:
 */
public class Test10 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("fos2.txt"));
		String line = null;
		char[] chars = null;
		while ((line = reader.readLine()) != null) {
			chars = line.toCharArray();
		}
		Arrays.sort(chars);
		BufferedWriter writer = new BufferedWriter(new FileWriter("fos2.txt"));
		writer.write(chars);
		writer.newLine();
		writer.flush();
		writer.close();
	}
}
