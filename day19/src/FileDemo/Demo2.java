package FileDemo;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional: 创建功能：
 *public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 *public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 *public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 *
 *骑白马的不一定是王子，可能是班长。
 *注意：你到底要创建文件还是文件夹，你最清楚，方法不要调错了。
 * @Date: Create in 10:52 2018/6/20
 * @Modify By:
 */
public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file=new File("G:\\AAA\\bb");
//		System.out.println(file.createNewFile());
		System.out.println(file.mkdirs());
	}
}
