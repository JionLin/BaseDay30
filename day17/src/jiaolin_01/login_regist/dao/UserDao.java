package jiaolin_01.login_regist.dao;

import jiaolin_01.login_regist.pojo.User;

/**
 * @Auther: Joinlin
 * @Descriptional: 注册和登录的接口
 * @Date: Create in 11:48 2018/6/14
 * @Modify By:
 */
public interface UserDao {

	boolean isLogin(String username,String password);

	void regist(User user);

}
