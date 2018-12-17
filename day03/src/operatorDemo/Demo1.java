package operatorDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: 运算符：
 * 就是对常量和变量进行操作的符号。
 * <p>
 * 分类：算术运算符，赋值运算符，比较运算符，逻辑运算符，位运算符，三目运算符
 * <p>
 * 算术运算符：
 * +,-,*,/,%,++,--
 * <p>
 * 注意事项：
 * A:整数相除只能得到整数。如果想得到小数，必须把数据变化为浮点数类型
 * B:/获取的是除法操作的商，%获取的是除法操作的余数
 * @Date: Create in 16:09 2018/6/17
 * @Modify By:
 */
public class Demo1 {
	public static void main(String[] args) {
		//定义变量
		int x = 3;  //把3赋值给int类型的变量x
		int y = 4;

		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y); //整数相除只能得到整数

		System.out.println("----");
		//我就想得到小数，该肿么办呢?
		//只需要把操作的数据中任意的一个数据变为浮点数
		System.out.println(x*1.0/y);

		//%的应用
		System.out.println(x%y); //得到的是余数
	}
}
