package jiaolin_04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Auther: Joinlin
 * @Descriptional: 接收端 ,接收数据
 * @Date: Create in 15:19 2018/7/2
 * @Modify By:
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端
		DatagramSocket socket = new DatagramSocket(10086);
		while (true) {
			//接收数据,使用一个包裹
			byte[] bytes = new byte[1024];
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

			socket.receive(packet);

			//进行数据的解析
			String ip = packet.getAddress().getHostAddress();
			String s = new String(packet.getData(), 0, packet.getLength());
			System.out.println(ip + " 接收的数据是: " + s);
		}
		//不需要关闭资源
//		socket.close();
	}
}
