package jiaolin_08;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 客户端键盘录入，服务器输出到控制台
 * @Date: Create in 17:09 2018/7/2
 * @Modify By:
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.191.2", 10086);
		//键盘录入 读取
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//写入
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
