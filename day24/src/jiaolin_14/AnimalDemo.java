package jiaolin_14;

/**
 * @Auther: Joinlin
 * @Descriptional: 工厂方法模式概述
 * 工厂方法模式中抽象工厂类负责定义创建对象的接口，具体对象的创建工作由继承抽象工厂的具体类实现。
 * 优点
 * 客户端不需要在负责对象的创建，从而明确了各个类的职责，如果有新的对象增加，只需要增加一个具体的类和具体的工厂类即可，
 * 不影响已有的代码，后期维护容易，增强了系统的扩展性
 * 缺点
 * 需要额外的编写代码，增加了工作量
 * @Date: Create in 9:39 2018/7/2
 * @Modify By:
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//要很多只猫
		Factory a = new CatFactory();
		Animal cat = a.createAnimal();
		cat.eat();
		System.out.println("-----");


		a = new DogFactory();
		Animal dog = a.createAnimal();
		dog.eat();


	}
}
