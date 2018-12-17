package jiaolin_11;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 客户端文本文件，服务器输出文本文件
 * @Date: Create in 10:26 2018/7/3
 * @Modify By:
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.191.2", 8888);

		//进行读取
		BufferedReader reader = new BufferedReader(new FileReader("fosCopy.txt"));
		//进行写到通道
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
