package jiaolin_02;

import java.io.*;

/**
 * @Auther: Joinlin
 * @Descriptional: 复制图片
 * <p>
 * 分析：
 * 复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 通过该原理，我们知道我们应该采用字节流。
 * 而字节流有4种方式，所以做这个题目我们有4种方式。推荐掌握第4种。
 * <p>
 * 数据源：
 * c:\\a.jpg -- FileInputStream -- BufferedInputStream
 * 目的地：
 * d:\\b.jpg -- FileOutputStream -- BufferedOutputStream
 * @Date: Create in 14:20 2018/6/22
 * @Modify By:
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		File srcFile = new File("airen.JPG");
		File destFile = new File("airenCopy.JPG");
//		method1(srcFile, destFile);
//		method2(srcFile,destFile);
//		method3(srcFile, destFile);
		method4(srcFile, destFile);

	}

	private static void method4(File srcFile, File destFile) throws IOException {
		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destFile));
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, len);
		}
		outputStream.close();
		inputStream.close();
	}

	private static void method3(File srcFile, File destFile) throws IOException {
		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destFile));
		int len = 0;
		while ((len = inputStream.read()) != -1) {
			outputStream.write(len);
		}
		outputStream.close();
		inputStream.close();
	}

	private static void method2(File srcFile, File destFile) throws IOException {
		FileInputStream stream = new FileInputStream(srcFile);
		FileOutputStream outputStream = new FileOutputStream(destFile);
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = stream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, len);
		}
		outputStream.close();
		stream.close();
	}

	private static void method1(File srcFile, File destFile) throws IOException {
		FileInputStream stream = new FileInputStream(srcFile);
		FileOutputStream outputStream = new FileOutputStream(destFile);
		int len = 0;
		while ((len = stream.read()) != -1) {
			outputStream.write(len);
		}
		outputStream.close();
		stream.close();
	}
}
