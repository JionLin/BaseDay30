/**
 * @Auther: Joinlin
 * @Descriptional: this和super的区别?
 * 分别是什么呢?
 * this代表本类对应的引用。
 * super代表父类存储空间的标识(可以理解为父类引用,可以操作父类的成员)
 * @Date: Create in 13:56 2018/6/6
 * @Modify By:
 */
public class ExtendsDemo5 {
	public static void main(String[] args) {
		Son5 son5=new Son5();
		son5.method();
	}
}
class Father5{
	int number=10;
	public void show(){
		int number=15;
	}
}
class Son5 extends Father5{
	int number=20;
	public void method(){
		int number=30;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}
