package FileDemo;

import java.io.File;

/**
 * @Auther: Joinlin
 * @Descriptional: 获取功能：
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 * @Date: Create in 14:26 2018/6/20
 * @Modify By:
 */
public class Demo7 {
	public static void main(String[] args) {
		File file=new File("G:\\");
		String[] list = file.list();
		for (String str:list){
			System.out.println(str);
		}

		File[] files = file.listFiles();
		for (File file1:files){
			System.out.println(file1);
		}
	}
}
