package ioDemo;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: 我有一个文本文件(user.txt)，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其实为”100”
 * @Date: Create in 15:30 2018/6/25
 * @Modify By:
 */
public class Demo5 {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		InputStream reader = new FileInputStream("user.txt");
		properties.load(reader);
		Set<String> set = properties.stringPropertyNames();
		for (String key : set) {
			if (key.equals("lisi")) {
				properties.setProperty("lisi", "100");
				break;
			}
		}
		OutputStream writer = new FileOutputStream("user.txt");
		properties.store(writer, null);
		reader.close();
		writer.close();
	}
}
