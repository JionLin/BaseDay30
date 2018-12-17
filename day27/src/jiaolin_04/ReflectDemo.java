package jiaolin_04;

import java.lang.reflect.Method;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 17:16 2018/7/3
 * @Modify By:
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		//获取子节码对象
		Class<?> forName = Class.forName("jiaolin_01.Person");
		// 获取所有的方法
		/*Method[] methods = forName.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}*/

		// 获取单个方法并使用
		Object instance = forName.newInstance();
		// public void show()	 无参数,无返回值
		// public Method getMethod(String name,Class<?>... parameterTypes)
		Method method = forName.getMethod("show");
		method.invoke(instance);

		// public Object invoke(Object obj,Object... args)
		// 返回值是Object接收,第一个参数表示对象是谁，第二参数表示调用该方法的实际参数

		// public void method(String s)
		Method method1 = forName.getMethod("method", String.class);

		// 设置方法的时候,方法里面有参数时,就需要设置参数,有返回值时,就需要附带返回值
		method1.invoke(instance, "你好");

		//	public String getString(String s, int i)
		Method getString = forName.getMethod("getString", String.class, int.class);
		Object gs = getString.invoke(instance, "素素", 18);
		System.out.println(gs);

		//private void function()
		Method function = forName.getDeclaredMethod("function");
		function.setAccessible(true);
		function.invoke(instance);


	}
}
