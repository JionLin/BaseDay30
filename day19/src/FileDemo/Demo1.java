package FileDemo;

import java.io.File;

/**
 * @Auther: Joinlin
 * @Descriptional: * 我们要想实现IO的操作，就必须知道硬盘上文件的表现形式。
 * 而Java就提供了一个类File供我们使用。
 * <p>
 * File:文件和目录(文件夹)路径名的抽象表示形式
 * 构造方法：
 * File(String pathname)：根据一个路径得到File对象
 * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 * @Date: Create in 10:45 2018/6/20
 * @Modify By:
 */
public class Demo1 {
	public static void main(String[] args) {
		File file=new File("g:\\Demo\\a.txt");
		File file1=new File("g:\\Demo","a.txt");
		File file2=new File("g:\\Demo");
		File file3=new File(file2,"a.txt");


	}

}
