package jiaolin_05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: Joinlin
 * @Descriptional: 代理类
 * @Date: Create in 14:42 2018/7/4
 * @Modify By:
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("权限管理");
		Object result = method.invoke(target, args);
		System.out.println("日志控制");
		return result;
	}
}
