package ioDemo;

import java.io.*;
import java.util.Properties;

/**
 * @Auther: Joinlin
 * @Descriptional: 我有一个猜数字小游戏的程序，请写一个程序实现在测试类中只能用5次，超过5次提示：游戏试玩已结束，请付费。
 * @Date: Create in 15:30 2018/6/25
 * @Modify By:
 */
public class Demo6 {
	public static void main(String[] args) throws IOException {
		//把文档添加到集合中
		Properties properties = new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("count.txt"));
		properties.load(reader);
		reader.close();
		//在获取集合中里面的次数有多少
		String number = properties.getProperty("count");
		int count = Integer.parseInt(number);
		if (count >= 3) {
			System.out.println("已试玩3次,请付费");
			System.exit(0);
		} else {
			count++;
			properties.setProperty("count", String.valueOf(count));
			BufferedWriter writer = new BufferedWriter(new FileWriter("count.txt"));
			properties.store(writer, null);
			writer.close();
			GuessNumber.start();
		}
	}
}
