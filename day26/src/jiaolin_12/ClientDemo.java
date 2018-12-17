package jiaolin_12;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 客户端文本文件，服务器输出文本文件 并给出反馈
 * @Date: Create in 10:45 2018/7/3
 * @Modify By:
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.191.2", 8888);

		//读取文件
		BufferedReader reader = new BufferedReader(new FileReader("fosCopy.txt"));

		//写出到通道中
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		String line = null;
		while ((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		//告诉服务器,没有数据写入了
		socket.shutdownOutput();
		//接收服务器传过来的反馈
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String client = reader1.readLine();
		System.out.println(client);


		reader.close();
		socket.close();
	}
}
