package jiaolin_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: Joinlin
 * @Descriptional: 需求：通过反射去获取该构造方法并使用：
 * @Date: Create in 16:10 2018/7/3
 * @Modify By:
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<?> aClass = Class.forName("jiaolin_01.Person");
		Constructor<?> constructor = aClass.getConstructor(String.class, int.class, String.class);

//		通过带参构造方法对象创建对象
		// public T newInstance(Object... initargs)
		Object newInstance = constructor.newInstance("菜菜", 20, "深圳");
		System.out.println(newInstance);
	}
}
