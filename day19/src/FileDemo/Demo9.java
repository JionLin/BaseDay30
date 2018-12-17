package FileDemo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Auther: Joinlin
 * @Descriptional: 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * A:先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出。
 * B:获取的时候就已经是满足条件的了，然后输出即可。
 * <p>
 * 要想实现这个效果，就必须学习一个接口：文件名称过滤器
 * public String[] list(FilenameFilter filter)
 * public File[] listFiles(FilenameFilter filter)
 * @Date: Create in 14:41 2018/6/20
 * @Modify By:
 */
public class Demo9 {
	public static void main(String[] args) {
		File f=new File("G:\\");
		//匿名内部类
		String[] list = f.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile()&&name.endsWith(".jpg");
			}
		});
		for (String str:list){
			System.out.println(str);
		}
	}
}
