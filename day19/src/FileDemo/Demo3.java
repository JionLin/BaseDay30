package FileDemo;

import java.io.File;

/**
 * @Auther: Joinlin
 * @Descriptional: 删除功能:public boolean delete()
 *
 * 注意：
 * 		A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
 * 		B:Java中的删除不走回收站。
 * 		C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 * @Date: Create in 11:01 2018/6/20
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) {
		//在day04的目录下面,
		File file=new File("aaa");
//		System.out.println(file.mkdirs());
		System.out.println(file.delete());
	}
}
