package ioDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @Auther: Joinlin
 * @Descriptional: nio包在JDK4出现，提供了IO流的操作效率。但是目前还不是大范围的使用。
 * 有空的话了解下，有问题再问我。
 * <p>
 * JDK7的之后的nio：
 * Path:路径
 * Paths:有一个静态方法返回一个路径
 * public static Path get(URI uri)
 * Files:提供了静态方法供我们使用
 * public static long copy(Path source,OutputStream out):复制文件
 * public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset cs,OpenOption... options)
 * @Date: Create in 16:10 2018/6/25
 * @Modify By:
 */
public class nioDemo {
	public static void main(String[] args) throws IOException {
//		long copy = Files.copy(Paths.get("count.txt"), new FileOutputStream("count2.txt"));
//		System.out.println(copy);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
//		Files.write(Paths.get("count.txt"), list, Charset.forName("GBK"));
//		Files.write(Paths.get("array.txt"), list, Charset.forName("GBK"));
	}
}
