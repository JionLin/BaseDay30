package jiaolin_06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: TCP协议发送数据：
 * A:创建发送端的Socket对象
 * 这一步如果成功，就说明连接已经建立成功了。
 * B:获取输出流，写数据
 * C:释放资源
 * @Date: Create in 16:03 2018/7/2
 * @Modify By:
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端
		Socket socket = new Socket("192.168.191.4",10086);
		//获取输入流,写数据
		OutputStream wirter = socket.getOutputStream();
		byte[] bytes = "你好啊,tcp,我来了".getBytes();
		wirter.write(bytes);
		socket.close();
	}
}
