package IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：把e:\\哥有老婆.mp4复制到当前项目目录下的copy.mp4中
 * <p>
 * 数据源： 周传雄 - 有没有一首歌会让你想起我.mp3
 * G:\CloudMusic\周传雄\周传雄 - 有没有一首歌会让你想起我.mp3--读取数据--FileInputStream
 * 目的地：
 * copy.mp4--写出数据--FileOutputStream
 * @Date: Create in 11:43 2018/6/21
 * @Modify By:
 */
public class Demo8 {
	public static void main(String[] args) throws IOException {
		//进行数据读取
		FileInputStream fis = new FileInputStream("G:\\CloudMusic\\周传雄\\周传雄 - 有没有一首歌会让你想起我.mp3");
		//进行数据写出
		FileOutputStream fos = new FileOutputStream("copy.mp4");
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}
		fos.close();
		fis.close();
	}
}
