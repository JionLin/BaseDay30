package jiaolin_11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 客户端文本文件，服务器输出文本文件
 * @Date: Create in 10:26 2018/7/3
 * @Modify By:
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8888);
		Socket s = socket.accept();
		//读取
		BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//写出到文本文件中
		BufferedWriter writer = new BufferedWriter(new FileWriter("b.txt"));
		String line = null;
		while ((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		s.close();
	}
}
