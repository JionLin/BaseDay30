package jiaolin_02;

import javax.sound.midi.Soundbank;
import java.io.*;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：复制指定目录下的指定文件，并修改后缀名。
 * 指定的文件是：.java文件。
 * 指定的后缀名是：.jad
 * 指定的目录是：jad
 * <p> G:\java
 * 数据源：G:\\java\\A.java
 * 目的地：e:\\jad\\A.jad
 * @Date: Create in 16:06 2018/6/22
 * @Modify By:
 */
public class Test7 {
	public static void main(String[] args) throws IOException {
		//数据源和目标源
		File srcFile = new File("G:\\java");
		File destFile = new File("e:\\jad");

		if (!destFile.exists()) {
			destFile.mkdir();
		}
		//拿到数据源中以.java结尾的文件
		File[] files = srcFile.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		//进行遍历,拿到数据源中以.java结尾的文件
		for (File file : files) {
			//把文件复制到另外的目录中,拿到文件的名字
			String fileName = file.getName();
			File newFile = new File(destFile, fileName);
			CopyFile(file, newFile);

		}

		//进行目标文件夹中的.java文件改名成.jad文件
		for (File file : destFile.listFiles()) {
			//把java改成.jad
			String fileName = file.getName().replace(".java", ".jad");
			//把旧的文件改成新的文件名
			file.renameTo(new File(destFile, fileName));
		}


	}

	//复制到目标文件夹中
	private static void CopyFile(File file, File newFile) throws IOException {
		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(newFile));
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, len);
		}
		outputStream.close();
		inputStream.close();
	}
}
