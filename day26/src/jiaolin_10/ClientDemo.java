package jiaolin_10;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 客户端文本文件，服务器输出到控制台
 * @Date: Create in 10:14 2018/7/3
 * @Modify By:
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.191.2", 8888);

		//读取
		BufferedReader reader = new BufferedReader(new FileReader("fosCopy.txt"));

		//写出到通道中
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		String line = null;
		while ((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		reader.close();
		socket.close();

	}
}
