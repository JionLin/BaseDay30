package jiaolin_14;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 一个服务器接收多个客户端。
 * @Date: Create in 14:07 2018/7/3
 * @Modify By:
 */
public class ClientDemo {
	//以复制文件为例
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.191.2", 8888);
		//读取文件
		BufferedReader reader = new BufferedReader(new FileReader("day04总结.txt"));

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		String line = null;
		while ((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		//告诉服务端没有数据传送过去了
		socket.shutdownOutput();
		//获取反馈
		/*InputStream is2 = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int len2 = is2.read(bytes);
		System.out.println("客户端接收的信息:	" + new String(bytes, 0, len2));*/

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String client = br.readLine();
		System.out.println("客户端接收到的反馈信息是:	" + client);

		//释放资源
		reader.close();
		socket.close();
	}
}
