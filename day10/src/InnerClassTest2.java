/**
 * @Auther: Joinlin
 * @Descriptional: 匿名内部类在开发中的使用
 * 匿名内部类的本质是继承类或者实现了接口的子类匿名对象
 * @Date: Create in 14:50 2018/6/7
 * @Modify By:
 */
public class InnerClassTest2 {
	public static void main(String[] args) {
		PersonDemo2 personDemo2=new PersonDemo2();
//		Person2 p=new Student4();
//		personDemo2.method(p);
//		System.out.println("-----------------");

		personDemo2.method(new Person2() {
			@Override
			public void study() {
				System.out.println("好好学习,天天向上");
			}
		});
	}
}
interface Person2{
	void study();
}
/*class Student4 implements Person2{

	@Override
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}*/
class PersonDemo2{
	//接口名作为形式参数
	//其实这里需要的不是接口，而是该接口的实现类的对象
	public void method(Person2 p){
		p.study();
	}
}