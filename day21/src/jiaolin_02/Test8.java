package jiaolin_02;

import java.io.*;


/**
 * @Auther: Joinlin
 * @Descriptional: 复制多级文件夹
 * 数据源:G:\基础代码编写\day21code\demos
 * 目标源G:\
 * 文件夹进行遍历,进行递归
 * @Date: Create in 9:16 2018/6/25
 * @Modify By:
 */
public class Test8 {
	public static void main(String[] args) throws IOException {
		File srcFile = new File("G:\\基础代码编写\\day21code\\demos");
		File destFile = new File("G:\\");
		copyFolder(srcFile, destFile);
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException {
		if (srcFile.isDirectory()) {
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();
			for (File file : srcFile.listFiles()) {
				copyFolder(file, newFolder);
			}
		} else {
			File file = new File(destFile, srcFile.getName());
			copyFiles(srcFile, file);
		}
	}

	private static void copyFiles(File srcFile, File destFile) throws IOException {
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
}
