package jiaolin_15;

/**
 * @Auther: Joinlin
 * @Descriptional: //懒汉式  在面试的时候使用,有3个步骤
 * 构造私有,
 * 创建一个对象
 * 对外提供公共的方法使用
 * @Date: Create in 10:16 2018/7/2
 * @Modify By:
 */
public class Teacher {
	//构造私有
	private Teacher() {
	}

	//创建对象
	private static Teacher teacher = null;

	//对外提供公共的方法
	public static synchronized Teacher getTeacher() {
		if (teacher == null) {
			teacher = new Teacher();
		}
		return teacher;
	}

}
