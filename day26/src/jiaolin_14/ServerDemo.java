package jiaolin_14;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional: 一个服务器接收多个客户端。
 * @Date: Create in 14:07 2018/7/3
 * @Modify By:
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8888);
		while (true) {
			Socket ss = socket.accept();
			new Thread(new UserThread(ss)).start();
		}
	}
}
