package jiaolin_13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 上传图片案例
 * @Date: Create in 11:07 2018/7/3
 * @Modify By:
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8888);

		Socket s = socket.accept();
		//进行图片的读取从通道中
		BufferedInputStream inputStream = new BufferedInputStream(s.getInputStream());
		//进行写出一个图片
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("a.jpg"));
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, len);
			outputStream.flush();
		}
		//进行反馈
		OutputStream outputStream1 = s.getOutputStream();
		outputStream1.write("文件接收成功".getBytes());

		outputStream.close();
		s.close();

	}
}
