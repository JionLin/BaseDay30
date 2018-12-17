package jiaolin_12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 客户端文本文件，服务器输出文本文件 并给出反馈
 * @Date: Create in 10:45 2018/7/3
 * @Modify By:
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8888);
		Socket s = socket.accept();

		//进行读取
		BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

		//进行写到文本文件
		BufferedWriter writer = new BufferedWriter(new FileWriter("c.txt"));
		String line = null;
		while ((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		//给出反馈 通过通过
		BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		writer1.write("文件上传成功");
		writer1.newLine();
		writer1.flush();

		//释放资源
		writer1.close();
//		writer.close();
		s.close();

	}
}
