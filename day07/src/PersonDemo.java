/**
 * @Auther: Joinlin
 * @Descriptional: 引入static关键字
 * @Date: Create in 9:53 2018/6/6
 * @Modify By:
 */


public class PersonDemo {
	public static void main(String[] args) {
		Person person=new Person("林志玲",18,"中国");
		person.show();
		Person person2=new Person("江疏影",20);
		person2.show();
		Person person3=new Person("波多",18);
		person3.show();

		person3.setCountry("美国");
		person.show();
		person2.show();
		person3.show();
	}
}
class Person{
	String name;
	int age;
	static String country;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age,String country) {
		this.name = name;
		this.age = age;
		this.country=country;
	}


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

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Person.country = country;
	}

	public void show(){
		System.out.println("姓名:"+name+"年龄:"+age+"国家:"+country);
	}
}
