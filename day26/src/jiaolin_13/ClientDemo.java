package jiaolin_13;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 上传图片案例
 * @Date: Create in 11:07 2018/7/3
 * @Modify By:
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.191.2", 8888);
		//读取图片
		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("airen.JPG"));
		//写入到通道中
		BufferedOutputStream outputStream = new BufferedOutputStream(socket.getOutputStream());

		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, len);
			outputStream.flush();
		}

		//进行关闭
		socket.shutdownOutput();

		//获取反馈
		InputStream is = socket.getInputStream();
		byte[] bys = new byte[1024];
		int read = is.read(bys);
		String client = new String(bys, 0, read);
		System.out.println(client);
		/*InputStream is = socket.getInputStream();
		int len2 = 0;
		byte[] bytes2 = new byte[1024];
		while ((len2 = is.read(bytes2)) != -1) {
			System.out.println(new String(bytes2, 0, len2));
		}*/


		inputStream.close();
		socket.close();
	}
}
