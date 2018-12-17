package jiaolin_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: Joinlin
 * @Descriptional: UDP协议接收数据：
 * A:创建接收端Socket对象
 * B:创建一个数据包(接收容器)
 * C:调用Socket对象的接收方法接收数据
 * D:解析数据包，并显示在控制台
 * E:释放资源
 * @Date: Create in 14:20 2018/7/2
 * @Modify By:
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端Socket对象
		DatagramSocket socket = new DatagramSocket(10086);

		//创建一个数据包(接收容器)
		byte[] bytes = new byte[1024];
		int length = bytes.length;
		DatagramPacket packet = new DatagramPacket(bytes, length);

		//调用scoket对象的接收方法接收数据
		socket.receive(packet);

		//解析数据包,并显示在控制台
		InetAddress address = packet.getAddress();
		//获取对方的ip
		String ip = address.getHostAddress();
		// public byte[] getData():获取数据缓冲区
		// public int getLength():获取数据的实际长度
		byte[] data = packet.getData();
		int len = packet.getLength();
		String s = new String(data, 0, len);

		System.out.println(ip + "传送的数据是: " + s);

		socket.close();

	}
}
