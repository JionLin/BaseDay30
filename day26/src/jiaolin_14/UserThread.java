package jiaolin_14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 14:08 2018/7/3
 * @Modify By:
 */
public class UserThread implements Runnable {
	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	//多个线程进行复制
	@Override
	public void run() {
		//获取通道内流
		try {
			//从通道内读取数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//写出数据
			String random = System.currentTimeMillis() + ".txt";
			BufferedWriter writer = new BufferedWriter(new FileWriter(random));

			//进行数据读写
			String line = null;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
				writer.flush();
			}
			//进行反馈
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write("已经接收成功");
			bw.newLine();
			bw.flush();

			writer.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
