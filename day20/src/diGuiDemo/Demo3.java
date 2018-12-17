package diGuiDemo;

import java.io.File;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：递归删除带内容的目录
 * <p>
 * 目录我已经给定：demo
 * <p>
 * @Date: Create in 15:56 2018/6/20
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) {
		File file = new File("demo");
		deleteFile(file);
	}

	public static void deleteFile(File srcFolder) {
		//进行获取所有文件
		//进行遍历,来判断是否是文件,
		for (File file : srcFolder.listFiles()) {
			if (file.isDirectory()) {
				deleteFile(file);
			} else {
				System.out.println(file.getName() + "---" + file.delete());
			}
		}
		System.out.println(srcFolder.getName() + "------" + srcFolder.delete());
	}

}
