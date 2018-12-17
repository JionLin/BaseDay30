package jiaolin_03;

import java.lang.reflect.Field;

/**
 * @Auther: Joinlin
 * @Descriptional: 通过发生获取成员变量并使用
 * @Date: Create in 16:38 2018/7/3
 * @Modify By:
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class<?> forName = Class.forName("jiaolin_01.Person");
		/*Field[] fields = forName.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}*/
//		Field[] fields = forName.getDeclaredFields();
		/*for (Field field : fields) {
			System.out.println(field);
		}*/

		// 通过无参构造方法创建对象
		Object instance = forName.newInstance();
		System.out.println(instance);

		// public void set(Object obj,Object value)
		// 获取单个的成员变量
		// 获取address并对其赋值
		Field addressField = forName.getField("address");
		addressField.set(instance, "北京");
		System.out.println(instance);


		// public void set(Object obj,Object value)
		// 将指定对象变量上此 Field 对象表示的字段设置为指定的新值。

		// 获取name并对其赋值
		// NoSuchFieldException
		Field declaredField = forName.getDeclaredField("name");
		//暴力获取
		declaredField.setAccessible(true);

		declaredField.set(instance, "菜菜");
		System.out.println(instance);


		// 获取age并对其赋值
		Field age = forName.getDeclaredField("age");
		age.setAccessible(true);
		age.set(instance, 18);
		System.out.println(instance);

	}
}
