package jiaolin_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: Joinlin
 * @Descriptional: udp发送端
 * 创建发送端,
 * 把数据进行打包
 * 进行发送
 * 关闭资源
 * @Date: Create in 14:53 2018/7/2
 * @Modify By:
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端
		DatagramSocket socket = new DatagramSocket();

		//把数据进行打包
		byte[] bytes = "你好,udp,我来了".getBytes();
		DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.191.4"), 10086);

		//发送数据
		socket.send(packet);
		//释放资源
		socket.close();
	}
}
