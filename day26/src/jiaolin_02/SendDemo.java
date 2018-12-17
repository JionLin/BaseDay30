package jiaolin_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: Joinlin
 * @Descriptional: UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 * @Date: Create in 14:20 2018/7/2
 * @Modify By:
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//创建发送socket对象
		DatagramSocket socket = new DatagramSocket();
		//创建数据 并把数据打包
		byte[] buf = "你好,我来了".getBytes();
		int length = buf.length;
		InetAddress address = InetAddress.getByName("192.168.191.4");
		int port = 10086;
		DatagramPacket packet = new DatagramPacket(buf, length, address, port);
		//发送数据
		socket.send(packet);
		//释放资源
		socket.close();
	}
}
