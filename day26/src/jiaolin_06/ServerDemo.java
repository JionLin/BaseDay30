package jiaolin_06;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: TCP协议接收数据：
 * A:创建接收端的Socket对象
 * B:监听客户端连接。返回一个对应的Socket对象
 * C:获取输入流，读取数据显示在控制台
 * D:释放资源
 * @Date: Create in 16:04 2018/7/2
 * @Modify By:
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端的socket对象
		ServerSocket socket = new ServerSocket(10086);
		//监听客户端连接
		Socket accept = socket.accept();
		InputStream read = accept.getInputStream();
		byte[] bytes = new byte[1024];
		int data = read.read(bytes);
		//进行解析
		String ip = accept.getInetAddress().getHostAddress();
		String s = new String(bytes, 0, data);

		System.out.println(ip + "接收的数据为" + s);

	}
}
