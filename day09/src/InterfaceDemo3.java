import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Auther: Joinlin
 * @Descriptional: 猫狗案例,加入跳高的额外功能
 * @Date: Create in 10:06 2018/6/7
 * @Modify By:
 */
public class InterfaceDemo3 {
	public static void main(String[] args) {
		JumpDog jumpDog=new JumpDog(3,"老虎");
		jumpDog.eat();
		jumpDog.sleep();
		jumpDog.jump();
		System.out.println(jumpDog.getAge()+";"+jumpDog.getName());
	}
}
interface Jumpping {
	void jump();
}
abstract class Animal4{
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int age;
	String name;

	public Animal4() {
	}

	public Animal4(int age, String name) {

		this.age = age;
		this.name = name;
	}
	public void sleep(){
		System.out.println("睡觉");
	}
	public abstract void eat();
}
class Dog4 extends Animal4{

	public Dog4() {
	}

	public Dog4(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}
}
class Cat4 extends Animal4{

	public Cat4() {
	}

	public Cat4(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
}
class JumpCat extends Cat4 implements Jumpping{

	public JumpCat() {
	}

	public JumpCat(int age, String name) {
		super(age, name);
	}

	@Override
	public void jump() {
		System.out.println("跳高功能的猫");
	}
}
class JumpDog extends Dog4 implements Jumpping{

	public JumpDog() {
	}

	public JumpDog(int age, String name) {
		super(age, name);
	}

	@Override
	public void jump() {
		System.out.println("跳高功能的狗");
	}
}