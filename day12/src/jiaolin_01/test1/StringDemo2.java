package jiaolin_01.test1;

/**
 * @Auther: Joinlin
 * @Descriptional: * 字符串的特点：一旦被赋值，就不能改变。
 * * String s = new String(“hello”)和String s = “hello”;的区别?
 * 有。前者会创建2个对象，后者创建1个对象。
 * @Date: Create in 16:48 2018/6/7
 * @Modify By:
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println(s);
		System.out.println("------");

		String s1=new String("hello");
		String s2="hello";
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));
	}
}
