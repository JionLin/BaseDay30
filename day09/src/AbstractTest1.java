/**
 * @Auther: Joinlin
 * @Descriptional: 因为有共性的内容，所以就提取了一个父类。动物。
 * 但是又由于吃饭的内容不一样，所以吃饭的方法是抽象的，
 * 而方法是抽象的类，类就必须定义为抽象类。
 * <p>
 * 抽象动物类：
 * 成员变量：姓名，年龄
 * 构造方法：无参，带参
 * 成员方法：吃饭();
 * <p>
 * 实现：从抽象到具体
 * 动物类:
 * 成员变量：姓名，年龄
 * 构造方法：无参，带参
 * 成员方法：吃饭();
 * <p>
 * 狗类：
 * 继承自动物类
 * 重写吃饭();
 * <p>
 * 猫类：
 * 继承自动物类
 * 重写吃饭();
 * @Date: Create in 8:59 2018/6/7
 * @Modify By:
 */
public class AbstractTest1 {
	//进行测试狗类和猫类
	public static void main(String[] args) {
		Animal animal=new Dog("小黄",2);
		animal.eat();
		System.out.println(animal.getName()+animal.getAge());

		animal=new Cat("麦克",2);
		animal.eat();
		System.out.println(animal.getName()+animal.getAge());

	}
}

abstract class Animal {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String name;
	int age;

	public Animal() {
	}

	public Animal(String name, int age) {

		this.name = name;
		this.age = age;
	}
	public abstract void eat();
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}
}
class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("猫 吃 鱼");
	}

	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}
}