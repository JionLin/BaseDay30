package jiaolin_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: Joinlin
 * @Descriptional: 看InetAddress的成员方法：
 * public static InetAddress getByName(String host):
 * 根据主机名或者IP地址的字符串表示得到IP地址对象
 * @Date: Create in 11:36 2018/7/2
 * @Modify By:
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getByName("192.168.121.4");
		//获取主机名
		String address = inetAddress.getHostAddress();
		//获取ip
		String ip = inetAddress.getHostName();
		System.out.println(address);
		System.out.println(ip);

	}
}
