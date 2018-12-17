package FileDemo;

import java.io.File;

/**
 * @Auther: Joinlin
 * @Descriptional: 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 *
 * 分析：
 * 		A:封装e判断目录
 * 		B:获取该目录下所有文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象，然后判断
 * 		D:是否是文件
 * 			是：继续判断是否以.jpg结尾
 * 				是：就输出该文件名称
 * 				否：不搭理它
 * 			否：不搭理它
 * @Date: Create in 14:36 2018/6/20
 * @Modify By:
 */
public class Demo8 {
	public static void main(String[] args) {
		File file=new File("G:\\");
		File[] files = file.listFiles();
		for (File file1:files){
			if (file1.isFile()){
				if (file1.getName().endsWith(".jpg")){
					System.out.println(file1.getName());
				}
			}
		}
	}
}
