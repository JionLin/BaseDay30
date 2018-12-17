package jiaolin_10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 客户端文本文件，服务器输出到控制台
 * @Date: Create in 10:14 2018/7/3
 * @Modify By:
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8888);

		Socket s = socket.accept();
		//输出到控制台 高效读出
		BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

//		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

	}
}
