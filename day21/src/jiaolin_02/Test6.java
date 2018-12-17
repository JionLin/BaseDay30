package jiaolin_02;

import javax.sound.midi.Soundbank;
import java.io.*;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：复制单极文件夹
 * * 数据源：d:\\demo
 * 目的地：d:\\test
 * 分析：
 * A:封装目录
 * B:获取该目录下的所有文本的File数组
 * C:遍历该File数组，得到每一个File对象
 * D:把该File进行复制
 * @Date: Create in 15:30 2018/6/22
 * @Modify By:
 */
public class Test6 {
	public static void main(String[] args) throws IOException {
		//进行数据源和目标源的封装
		File srcFile = new File("d:\\demo");
		File destFile = new File("d:\\test");
		if (!destFile.isDirectory()) {
			destFile.mkdir();
		}
		//进行遍历数据源中的文件
		File[] files = srcFile.listFiles();
		for (File file : files) {
			String name = file.getName();
			File file2 = new File(destFile, name);
			CopyFile(file, file2);
		}

	}

	private static void CopyFile(File srcFile, File destFile) throws IOException {
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
