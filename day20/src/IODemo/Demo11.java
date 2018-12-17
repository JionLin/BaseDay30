package IODemo;

import java.io.*;

/**
 * @Auther: Joinlin
 * @Descriptional: 把数据源拷贝到目标源中去
 * G:\CloudMusic\周传雄\周传雄 - 有没有一首歌会让你想起我.mp3
 * <p>
 * 使用FileInputStream  读取一个字节 消耗的时间为34956毫秒
 * 使用FileInputStream  读取一个字节数组 消耗的时间为70毫秒
 * 使用BufferedFileInputStream  读取一个字节 消耗的时间为272毫秒
 * 使用BufferedFileInputStream  读取一个字节数组 消耗的时间为24毫秒
 * @Date: Create in 12:54 2018/6/21
 * @Modify By:
 */
public class Demo11 {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
//		method1("G:\\CloudMusic\\周传雄\\周传雄 - 有没有一首歌会让你想起我.mp3", "copy.mp4");
//		method2("G:\\CloudMusic\\周传雄\\周传雄 - 有没有一首歌会让你想起我.mp3","copy.mp4");
//		method3("G:\\CloudMusic\\周传雄\\周传雄 - 有没有一首歌会让你想起我.mp3","copy.mp4");
		method4("G:\\CloudMusic\\周传雄\\周传雄 - 有没有一首歌会让你想起我.mp3","copy.mp4");
		long end = System.currentTimeMillis();
		System.out.println("消耗的时间为" + (end - start) + "毫秒");
	}

	private static void method1(String srcFolder, String destFolder) throws IOException {
		FileInputStream fis = new FileInputStream(srcFolder);
		FileOutputStream fos = new FileOutputStream(destFolder);
		int len = 0;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}
		fos.close();
		fis.close();
	}

	private static void method2(String srcFolder, String destFolder) throws IOException {
		FileInputStream fis = new FileInputStream(srcFolder);
		FileOutputStream fos = new FileOutputStream(destFolder);
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}
		fos.close();
		fis.close();
	}
	private static void method3(String srcFolder, String destFolder) throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(srcFolder));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(destFolder));
		int len = 0;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}
		fos.close();
		fis.close();
	}
	private static void method4(String srcFolder, String destFolder) throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(srcFolder));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(destFolder));
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}
		fos.close();
		fis.close();
	}
}
