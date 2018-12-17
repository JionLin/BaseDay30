package jiaolin_02;

import jiaolin_01.Person;

import java.lang.reflect.Constructor;

/**
 * @Auther: Joinlin
 * @Descriptional: 通过反射获取构造方法并使用。
 * @Date: Create in 15:58 2018/7/3
 * @Modify By:
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
		//获取字节码文件对象
		//获取单个构造方法

		Class<?> forName = Class.forName("jiaolin_01.Person");

		//对象的构造方法 所有公共的
		Constructor<?>[] constructors = forName.getConstructors();
	/*	for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}*/

		Constructor<?> constructor = forName.getConstructor(String.class, int.class, String.class);
		System.out.println(constructor);
		//public T newInstance(Object... initargs)
		// 使用此 Constructor 对象表示的构造方法来创建该构造方法
		// 的声明类的新实例，并用指定的初始化参数初始化该实例。
		Person instance = (Person) forName.newInstance();
		System.out.println(instance);
	}
}
