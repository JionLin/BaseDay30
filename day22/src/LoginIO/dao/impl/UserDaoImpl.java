package LoginIO.dao.impl;


import LoginIO.dao.UserDao;
import LoginIO.pojo.User;

import java.io.*;
import java.util.ArrayList;

/**
 * @Auther: Joinlin
 * @Descriptional: 登录和注册的实现类
 * @Date: Create in 11:48 2018/6/14
 * @Modify By:
 */
public class UserDaoImpl implements UserDao {

	public static File file = new File("user.txt");

	static {
		try {
			//进行创建新文件
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("文件创建失败");
			e.printStackTrace();
		}
	}

	//用io留存储用户信息
	//就需要进行,写入和读取进去
	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;
		//进行读取数据
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] date = line.split("=");
				if (username.equals(date[0]) && password.equals(date[1])) {
					flag = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("数据读取错误");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("释放资源错误");
					e.printStackTrace();

				}
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		//注册,就需要进行写入进去
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(user.getUsername() + "=" + user.getPassword());
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			System.out.println("注册出错");
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("注册时释放资源错误");
					e.printStackTrace();
				}
			}
		}
	}
}
