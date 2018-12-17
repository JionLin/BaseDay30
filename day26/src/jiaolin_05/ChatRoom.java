package jiaolin_05;

import java.io.IOException;
import java.net.DatagramSocket;

/**
 * @Auther: Joinlin
 * @Descriptional: 通过多线程改进刚才的聊天程序，这样我就可以实现在一个窗口发送和接收数据了
 * @Date: Create in 15:44 2018/7/2
 * @Modify By:
 */
public class ChatRoom {
	public static void main(String[] args) throws IOException {
		DatagramSocket send = new DatagramSocket();
		DatagramSocket receive = new DatagramSocket(10086);

		//创建实例
		SendDemo sendDemo = new SendDemo(send);
		ReceiveDemo receiveDemo = new ReceiveDemo(receive);

		//创建对象
		Thread t1 = new Thread(sendDemo);
		Thread t2 = new Thread(receiveDemo);
		//启动线程
		t1.start();
		t2.start();
	}
}
