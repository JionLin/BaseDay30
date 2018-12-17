package FileDemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Joinlin
 * @Descriptional: 获取功能：
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度。字节数
 * public long lastModified():获取最后一次的修改时间，毫秒值
 * @Date: Create in 11:20 2018/6/20
 * @Modify By:
 */
public class Demo6 {
	public static void main(String[] args) {
		File file=new File("aaa\\a.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.length());
//		System.out.println(file.lastModified());
		String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
		System.out.println(format);

	}
}
