/**
 * @Auther: Joinlin
 * @Descriptional: static的访问特点 静态只能访问静态 ,
 * 静态可以通过类名直接调用
 * 非静态方法可以访问非静态,也可以访问静态
 * @Date: Create in 10:06 2018/6/6
 * @Modify By:
 */
public class TeacherDemo {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		teacher.show();
		teacher.funcation();
		Teacher.method();
		teacher.method();
	}
}

class Teacher {
	int num = 10;
	public static int num2 = 20;

	public void show() {
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(num2);
	}

	public static void method() {
		System.out.println(num2);
		funcation2();

	}

	public void funcation() {
		method();
	}

	public static void funcation2() {
	}
}
