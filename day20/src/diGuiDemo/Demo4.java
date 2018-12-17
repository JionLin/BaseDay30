package diGuiDemo;

import java.io.File;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：请大家把E:\基础练习代码目录下所有的bmp/java结尾的文件的绝对路径给输出在控制台。
 * A进行遍历,拿到所有的文件,
 * B是否是以.bmp文件结尾
 * 		是:拿到绝对路径
 * 		否:回到A
 * @Date: Create in 16:23 2018/6/20
 * @Modify By:
 */
public class Demo4 {
	public static void main(String[] args) {
		File file=new File("E:\\基础练习代码");
		getAllFileBmp(file);
	}

	private static void getAllFileBmp(File file) {
		for (File file1 : file.listFiles()) {
			//判断是否是文件
			if (file1.isFile()){
				if (file1.getName().endsWith("java")){
					System.out.println(file1.getAbsolutePath());
				}
			}else {
				getAllFileBmp(file1);
			}
		}

	}
}
