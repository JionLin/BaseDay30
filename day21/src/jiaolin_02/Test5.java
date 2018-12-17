package jiaolin_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：我有一个文本文件中存储了几个名称，请大家写一个程序实现随机获取一个人的名字。
 * @Date: Create in 15:20 2018/6/22
 * @Modify By:
 */
public class Test5 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("fos2.txt"));
		ArrayList<String> list = new ArrayList<>();
		String line = null;
		while ((line = reader.readLine()) != null) {
			list.add(line);
		}
		//随机数
		Random random=new Random();
		//获取随机数是多少
		int i = random.nextInt(list.size());
		//使用get获取随机数,得到姓名,并打印出来
		String name = list.get(i);
		System.out.println(name);
	}
}
