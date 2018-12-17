package jiaolin_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 16:33 2018/7/2
 * @Modify By:
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(10086);
		Socket s = socket.accept();
		//获取输入流
		InputStream inputStream = s.getInputStream();
		byte[] bys = new byte[1024];
		int read = inputStream.read(bys);//阻塞
		String server = new String(bys, 0, read);
		System.out.println("srever: " + server);


		//获取输入流
		OutputStream outputStream = s.getOutputStream();
		byte[] bytes = "数据已经接收到了".getBytes();
		outputStream.write(bytes);

		//释放资源
		s.close();
		//服务器接收的不需要关闭资源
//		socket.close();
	}
}
