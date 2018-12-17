package jiaolin_01;

/**
 * @Auther: Joinlin
 * @Descriptional: 适配器设计模式
 * 问题：
 * 接口(方法比较多) -- 实现类(仅仅使用一个，也得把其他的实现给提供了，哪怕是空实现)
 * 太麻烦了。
 * 解决方案：
 * 接口(方法比较多) -- 适配器类(实现接口,仅仅空实现) -- 实现类(用哪个重写哪个)
 * <p>
 * 适配器设计模式概述
 * 将一个类的接口转换成另外一个客户希望的接口。从而使原来不能直接调用的接口变的可以调用。
 * 优点
 * 让本来不适合使用的接口变得适合使用
 * 缺点
 * 一次只能适配一个类，使用有一定的局限性
 * @Date: Create in 10:55 2018/7/2
 * @Modify By:
 */
public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		userDao.add();

		userDao = new UserDaoImp2();
		userDao.add();
	}
}
