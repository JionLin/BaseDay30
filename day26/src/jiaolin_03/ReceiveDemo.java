package jiaolin_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: Joinlin
 * @Descriptional: 接收端
 * 创建接收端
 * 接收端接收数据
 * 进行解析
 * 打印在控制台
 * @Date: Create in 14:53 2018/7/2
 * @Modify By:
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端
		DatagramSocket socket = new DatagramSocket(10086);
		//创建一个包裹
		byte[] bytes = new byte[1024];
		DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
		//接收数据,
		socket.receive(packet);
		//进行解析数据
		String ip = packet.getAddress().getHostAddress();
		String s = new String(packet.getData(), 0, packet.getLength());

		System.out.println(ip + "接收的是: " + s);
		socket.close();

	}
}
