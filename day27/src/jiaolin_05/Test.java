package jiaolin_05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: Joinlin
 * @Descriptional: Proxy.newProxyInstance的代理类
 * 以及InvacationHandler的invoke参数
 * @Date: Create in 14:40 2018/7/4
 * @Modify By:
 */
public class Test {
	public static void main(String[] args) {
		// 我们要创建一个动态代理对象
		// Proxy类中有一个方法可以创建动态代理对象
		// public static Object newProxyInstance(ClassLoader loader,Class<?>[]
		// interfaces,InvocationHandler h)
		UserDao userDao = new UserDaoImpl();
		// 我准备对ud对象做一个代理对象
		MyInvocationHandler handler = new MyInvocationHandler(userDao);
		UserDao proxyInstance = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), handler);
		proxyInstance.login();
		proxyInstance.regesit();
		System.out.println("------");

		//需要对StudentDao做义工动态代理
		StudentDao studentDao = new StudentDaoImpl();
		MyInvocationHandler handler2 = new MyInvocationHandler(studentDao);
		StudentDao student = (StudentDao) Proxy.newProxyInstance(studentDao.getClass().getClassLoader(), studentDao.getClass().getInterfaces(), handler2);
		student.add();
		student.delete();
		student.find();
		student.update();
	}
}
