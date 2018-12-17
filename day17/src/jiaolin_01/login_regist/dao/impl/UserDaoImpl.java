package jiaolin_01.login_regist.dao.impl;

import jiaolin_01.login_regist.dao.UserDao;
import jiaolin_01.login_regist.pojo.User;

import java.util.ArrayList;

/**
 * @Auther: Joinlin
 * @Descriptional: 登录和注册的实现类
 * @Date: Create in 11:48 2018/6/14
 * @Modify By:
 */
public class UserDaoImpl implements UserDao {
	//用集合来获取对象的参数
	private static ArrayList<User> list=new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag=false;
		for (User user:list){
			if (username.equals(user.getUsername())&&password.equals(user.getPassword())){
				flag=true;
				break;
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		//进行添加
		list.add(user);
	}
}
