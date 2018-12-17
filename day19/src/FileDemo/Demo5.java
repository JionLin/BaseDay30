package FileDemo;

import java.io.File;

/**
 * @Auther: Joinlin
 * @Descriptional: public boolean isDirectory():
 * public boolean isFile():
 * public boolean exists():
 * public boolean canRead():
 * public boolean canWrite():
 * public boolean isHidden():
 * @Date: Create in 11:17 2018/6/20
 * @Modify By:
 */
public class Demo5 {
	public static void main(String[] args) {
		File file=new File("a.txt");
		System.out.println(file.isDirectory());//f
		System.out.println(file.isFile());//t
		System.out.println(file.exists());//t
		System.out.println(file.canRead());//t
		System.out.println(file.canWrite());//t
		System.out.println(file.isHidden());//f
	}
}
