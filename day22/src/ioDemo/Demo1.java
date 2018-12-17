package ioDemo;

import java.io.*;

/**
 * @Auther: Joinlin
 * @Descriptional: 序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。对象 -- 流数据(ObjectOutputStream)
 * 反序列化流:把文本文件中的流对象数据或者网络中的流对象数据还原成对象。流数据 -- 对象(ObjectInputStream)
 * @Date: Create in 14:40 2018/6/25
 * @Modify By:
 */
public class Demo1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		read();
//		write();
	}

	private static void write() throws IOException {
		//把对象存在文本中 为write 序列化
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("fos.txt"));
		Person person = new Person("菜菜", 21);
		outputStream.writeObject(person);
	}

	private static void read() throws IOException, ClassNotFoundException {
		//反序列化
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("fos.txt"));
		Person person = (Person) inputStream.readObject();
		System.out.println(person);
		inputStream.close();

	}
}
