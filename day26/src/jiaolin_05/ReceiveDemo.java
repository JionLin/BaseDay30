package jiaolin_05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 15:44 2018/7/2
 * @Modify By:
 */
public class ReceiveDemo implements Runnable {
	private DatagramSocket socket;

	public ReceiveDemo(DatagramSocket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		//接收数据
		try {
			while (true) {
				byte[] bytes = new byte[1024];
				//进行打包 创建包裹
				DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
				socket.receive(packet);
				//进行解析
				String ip = packet.getAddress().getHostAddress();
				String data = new String(packet.getData(), 0, packet.getLength());
				System.out.println(ip + " 接收的数据 " + data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
