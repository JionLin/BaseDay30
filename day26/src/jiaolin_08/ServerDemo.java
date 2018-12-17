package jiaolin_08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 服务器端接收数据
 * @Date: Create in 17:09 2018/7/2
 * @Modify By:
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建服务端socket
		ServerSocket socket = new ServerSocket(10086);
		Socket accept = socket.accept();
		// 包装通道内容的流
		BufferedReader reader = new BufferedReader(new InputStreamReader(accept.getInputStream()));

		//进行读取
		String line = null;
		while ((line = reader.readLine()) != null) {
			//输出在控制台上
			System.out.println(line);
		}
		//释放资源
		accept.close();
	}
}
