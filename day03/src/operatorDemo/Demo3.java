package operatorDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: +的用法：
 * A:加法
 * B:正号
 * C:字符串连接符
 * @Date: Create in 16:21 2018/6/17
 * @Modify By:
 */
public class Demo3 {
	public static void main(String[] args) {
		//加法
		System.out.println(3+4);//7

		//正号
		System.out.println(+4);//4

		System.out.println('a');//a
		System.out.println('a'+1); //这里是加法98

		//字符串连接符
		System.out.println("hello"+'a'+1);//helloa1
		System.out.println('a'+1+"hello");//98hello
	}
}
