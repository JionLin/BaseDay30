/**
 * @Auther: Joinlin
 * @Descriptional: 教练和运动员案例(学生分析然后讲解)
 * 乒乓球运动员和篮球运动员。
 * 乒乓球教练和篮球教练。
 * 为了出国交流，跟乒乓球相关的人员都需要学习英语。
 * 请用所学知识：
 * 分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。
 * @Date: Create in 10:35 2018/6/7
 * @Modify By:
 */
public class InterfaceDemo4 {
	public static void main(String[] args) {
		PingpangqiuSporter pingpangqiuSporter=new PingpangqiuSporter(28,"小龙");
		pingpangqiuSporter.eat();
		pingpangqiuSporter.sleep();
		System.out.println(pingpangqiuSporter.getAge()+":"+pingpangqiuSporter.getName());
		pingpangqiuSporter.speakEnglish();
		System.out.println("---------------");


		lanqiuSporter lanqiuSporter =new lanqiuSporter(35,"姚明");
		lanqiuSporter.eat();
		lanqiuSporter.sleep();
		System.out.println(lanqiuSporter.getAge()+":"+lanqiuSporter.getName());
	}
}

interface speakEnglish {
	void speakEnglish();
}

abstract class Person4 {
	int age;
	String name;

	public Person4() {
	}

	public Person4(int age, String name) {
		this.age = age;
		this.name = name;
	}

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

	public void sleep() {
		System.out.println("睡觉");
	}

	public abstract void eat();
}

class Sporter extends Person {
	public Sporter() {
	}

	public Sporter(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("运动员吃肉");
	}
}

class Coach extends Person {

	public Coach() {
	}

	public Coach(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("教练吃素");
	}
}

class PingpangqiuSporter extends Sporter implements speakEnglish {

	public PingpangqiuSporter() {
	}

	public PingpangqiuSporter(int age, String name) {
		super(age, name);
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球运动员说英语");
	}
}

class lanqiuSporter extends Sporter {

	public lanqiuSporter() {
	}

	public lanqiuSporter(int age, String name) {
		super(age, name);
	}
}

class PingpangqiuCoach extends Coach implements speakEnglish {

	public PingpangqiuCoach() {
	}

	public PingpangqiuCoach(int age, String name) {
		super(age, name);
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球教练说英语");
	}
}

class lanqiuCoach extends Coach {

	public lanqiuCoach() {
	}

	public lanqiuCoach(int age, String name) {
		super(age, name);
	}
}