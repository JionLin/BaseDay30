package FileDemo;

import java.io.File;

/**
 * @Auther: Joinlin
 * @Descriptional:  重命名功能:public boolean renameTo(File dest)
 * 		如果路径名相同，就是改名。
 * 		如果路径名不同，就是改名并剪切。
 *
 * 路径以盘符开始：绝对路径	c:\\a.txt
 * 路径不以盘符开始：相对路径	a.txt
 * @Date: Create in 11:09 2018/6/20
 * @Modify By:
 */
public class Demo4 {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\jl250\\Desktop\\大胸妹.jpg");
		File file1=new File("G:\\大胸妹.jpg");
		System.out.println(file.renameTo(file1));
	}
}
