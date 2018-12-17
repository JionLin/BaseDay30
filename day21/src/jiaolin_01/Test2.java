package jiaolin_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 由于我们常见的操作都是使用本地默认编码，所以，不用指定编码。
 * 而转换流的名称有点长，所以，Java就提供了其子类供我们使用。
 * OutputStreamWriter = FileOutputStream + 编码表(GBK)
 * FileWriter = FileOutputStream + 编码表(GBK)
 *
 * InputStreamReader = FileInputStream + 编码表(GBK)
 * FileReader = FileInputStream + 编码表(GBK)
 *
/*
 * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 *
 * 数据源：
 * 		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader
 * 目的地：
 * 		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter
 * @Date: Create in 10:30 2018/6/22
 * @Modify By:
 */
public class Test2 {
	public static void main(String[] args) throws IOException{
		FileReader reader=new FileReader("fos.txt");
		FileWriter writer=new FileWriter("fos6.txt");
		char[] chars=new char[1024];
		int len=0;
		while ((len=reader.read(chars))!=-1){
			writer.write(chars,0,len);
			writer.flush();
		}
		writer.close();
		reader.close();
	}
}
