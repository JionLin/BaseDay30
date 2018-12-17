/**
 * @Auther: Joinlin
 * @Descriptional: 如果父类没有无参构造方法，那么子类的构造方法会出现什么现象呢?
 * 报错。
 * 如何解决呢?
 * A:在父类中加一个无参构造方法
 * B:通过使用super关键字去显示的调用父类的带参构造方法
 * C:子类通过this去调用本类的其他构造方法
 * 子类中一定要有一个去访问了父类的构造方法，否则父类数据就没有初始化。
 * <p>
 * 注意事项：
 * this(...)或者super(...)必须出现在第一条语句上。
 * 如果不是放在第一条语句上，就可能对父类的数据进行了多次初始化，所以必须放在第一条语句上。
 * @Date: Create in 14:22 2018/6/6
 * @Modify By:
 */
public class ExtendsDemo7 {
	public static void main(String[] args) {
		Son7 son7=new Son7();
		System.out.println("-----");
		Son7 son8=new Son7("林志玲");
	}
}
class Father7{
	public Father7(String name){
		System.out.println("这是父类的带参构造");
	}
}
class Son7 extends Father7{
	public Son7(){
		super("随便");
		System.out.println("这是子类的无参构造");
	}
	public Son7(String name){
		this();
		System.out.println("这是子类的带参构造");
	}
}