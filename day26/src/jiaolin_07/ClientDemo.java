package jiaolin_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 发送数据并且接收
 * @Date: Create in 16:32 2018/7/2
 * @Modify By:
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.191.4", 10086);
		//获取输出流,写入数据
		OutputStream outputStream = socket.getOutputStream();
		byte[] bytes = "你好,tcp/udp属于传输层".getBytes();
		outputStream.write(bytes);

		//获取输入流,读取数据
		InputStream inputStream = socket.getInputStream();

		byte[] bys = new byte[1024];
		int read = inputStream.read(bys);//读的时候,阻塞式方法
		String client = new String(bys, 0, read);
		System.out.println("client: " + client);
		socket.close();
	}
}
