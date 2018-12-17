package jiaolin_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 15:44 2018/7/2
 * @Modify By:
 */
public class SendDemo implements Runnable {
	private DatagramSocket socket;

	public SendDemo(DatagramSocket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		//发送数据  以键盘录入的方式
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while ((line = reader.readLine()) != null) {
				if ("886".equals(line)) {
					break;
				}
				//创建数据包,并打包
				byte[] bytes = line.getBytes();
				DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.191.4"), 10086);
				socket.send(packet);
			}
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
