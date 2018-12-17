package jiaolin_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: Joinlin
 * @Descriptional: 数据来自于键盘录入
 * 键盘录入数据要自己控制录入结束。
 * <p>
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 * @Date: Create in 15:18 2018/7/2
 * @Modify By:
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端
		DatagramSocket socket = new DatagramSocket();

		//创建数据,使用键盘录入模式   BufferedReader(Reader in)  InputStreamReader(InputStream in) 的父类是Reader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = reader.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			byte[] bytes = line.getBytes();
			//创建数据,并把数据打包
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.191.4"), 10086);
			socket.send(packet);
		}
		socket.close();
	}
}
