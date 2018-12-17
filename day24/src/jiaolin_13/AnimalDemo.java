package jiaolin_13;

/**
 * @Auther: Joinlin
 * @Descriptional: 简单工厂模式又称为静态工厂模式
 * 简单工厂模式概述
 * 又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
 * 优点
 * 客户端不需要在负责对象的创建，从而明确了各个类的职责
 * 缺点
 * 这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类，不利于后期的维护
 * @Date: Create in 9:15 2018/7/2
 * @Modify By:
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//实体类状态
		/*Animal a=new Cat();
		a.eat();
		a=new Dog();
		a.eat();*/

//		工厂模式
	/*	Cat cat = AnimalFactory.createCat();
		cat.eat();

		Dog dog = AnimalFactory.createDog();
		dog.eat();*/

		Animal a = AnimalFactory.createObj("dog");
		a.eat();
		a = AnimalFactory.createObj("cat");
		a.eat();

		a = AnimalFactory.createObj("pig");
		if (a != null) {
			a.eat();
		} else {
			System.out.println("没有你需要的动物");
		}

	}
}
