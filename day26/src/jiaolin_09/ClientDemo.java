package jiaolin_09;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 客户端键盘录入，服务器输出文本文件
 * @Date: Create in 9:57 2018/7/3
 * @Modify By:
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.191.2", 9999);
		//进行键盘录入写到服务器中  socket.getInputStream() 字节流
		// new InputStreamReader 字节流转换为字符流的桥梁
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//读取数据
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		String line = null;
		while ((line = reader.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		socket.close();
	}
}
