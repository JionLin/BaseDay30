package jiaolin_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：通过反射获取私有构造方法并使用
 * @Date: Create in 16:22 2018/7/3
 * @Modify By:
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<?> forName = Class.forName("jiaolin_01.Person");
		Constructor<?> constructor = forName.getDeclaredConstructor(String.class);
		//// 暴力访问
		constructor.setAccessible(true);
		Object instance = constructor.newInstance("菜菜");
		System.out.println(instance);
	}
}
