package ioDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Auther: Joinlin
 * @Descriptional: 这里的集合必须是Properties集合：
 * public void load(Reader reader):把文件中的数据读取到集合中
 * public void store(Writer writer,String comments):把集合中的数据存储到文件 store 存储
 * @Date: Create in 15:10 2018/6/25
 * @Modify By:
 */
public class Demo4 {
	public static void main(String[] args) throws IOException {
//		myLoads();
		myStore();
	}

	private static void myStore() throws IOException {
		Properties properties = new Properties();
		properties.setProperty("林允","经理");
		properties.setProperty("林志玲","白领");
		properties.setProperty("小三","老板");
		FileWriter writer = new FileWriter("properties.txt");
		properties.store(writer, "信息说明");
		writer.close();
	}

	private static void myLoads() throws IOException {
		Properties properties = new Properties();
		FileReader reader = new FileReader("user.txt");
		properties.load(reader);
		reader.close();
		System.out.println(properties);

	}


}
