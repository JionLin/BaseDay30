/**
 * @Auther: Joinlin
 * @Descriptional: ==:
 * 		基本类型：比较的就是值是否相同
 * 		引用类型：比较的就是地址值是否相同
 * equals:
 * 		引用类型：默认情况下，比较的是地址值。
 * 		不过，我们可以根据情况自己重写该方法。
 * 		一般重写都是自动生成，比较对象的成员变量值是否相同
 * @Date: Create in 15:25 2018/6/7
 * @Modify By:
 */
public class StudentDemo2 {
	public static void main(String[] args) {
		Student s1=new Student(18,"林志玲");
		Student s2=new Student(18,"林志玲");
		System.out.println(s1==s2); //false
		Student s3=s1;
		System.out.println(s1==s3);//true
		System.out.println(s1.equals(s2));

	}
}
