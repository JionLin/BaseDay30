/**
 * @Auther: Joinlin
 * @Descriptional: 局部变量和成员变量的区别
 * @Date: Create in 9:08 2018/6/6
 * @Modify By:
 */
public class VariableDemo {
	public static void main(String[] args) {
		Variable variable=new Variable();
//		System.out.println(variable.num);
		variable.show();
	}
}

class Variable{
	int num=10;//成员变量
	public void show(){
		int num2=20;//局部变量
		int num=30;
		System.out.println(num2);
		System.out.println(num);
	}
}