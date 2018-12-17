package jiaolin_02;

import java.io.*;
import java.security.PublicKey;

/**
 * @Auther: Joinlin
 * @Descriptional: 复制文本文件
 * <p>
 * 分析：
 * 复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 通过该原理，我们知道我们应该采用字符流更方便一些。
 * 而字符流有5种方式，所以做这个题目我们有5种方式。推荐掌握第5种。
 * 数据源：
 * c:\\a.txt -- FileReader -- BufferdReader
 * 目的地：
 * d:\\b.txt -- FileWriter -- BufferedWriter
 * @Date: Create in 11:44 2018/6/22
 * @Modify By:
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		//进行文本方式的复制,使用字符流
		String srcFile = "fos.txt";
		String destFile = "fosCopy.txt";
//		method1(srcFile, destFile);
//		method2(srcFile, destFile);
//		method3(srcFile, destFile);
//		method4(srcFile, destFile);

		method5(srcFile, destFile);
	}

	//记最终版
	private static void method5(String srcFile, String destFile) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(srcFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));
		String line = null;
		while ((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		writer.close();
		reader.close();
	}

	private static void method4(String srcFile, String destFile) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));
		BufferedReader reader = new BufferedReader(new FileReader(srcFile));
		int len = 0;
		char[] chars = new char[1024];
		while ((len = reader.read(chars)) != -1) {
			writer.write(chars, 0, len);
			writer.flush();
		}
		writer.close();
		reader.close();
	}

	private static void method3(String srcFile, String destFile) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(srcFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));
		int len = 0;
		while ((len = reader.read()) != -1) {
			writer.write(len);
			writer.flush();
		}
		writer.close();
		reader.close();
	}

	private static void method2(String srcFile, String destFile) throws IOException {
		FileReader reader = new FileReader(srcFile);
		FileWriter writer = new FileWriter(destFile);
		int len = 0;
		char[] chars = new char[1024];
		while ((len = reader.read(chars)) != -1) {
			writer.write(chars, 0, len);
			writer.flush();
		}
		writer.close();
		reader.close();
	}

	private static void method1(String srcFile, String destFile) throws IOException {
		FileReader reader = new FileReader(srcFile);
		FileWriter writer = new FileWriter(destFile);
		int len = 0;
		while ((len = reader.read()) != -1) {
			writer.write(len);
			writer.flush();
		}
		writer.close();
		reader.close();
	}
}
