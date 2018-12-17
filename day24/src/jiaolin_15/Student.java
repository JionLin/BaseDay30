package jiaolin_15;

/**
 * @Auther: Joinlin
 * @Descriptional: //开发,用饿汉式
 * 单例有3个讲究,才算
 * 构造私有
 * 在成员位置创建一个对象,给自己使用
 * 对外提供一个公共的方法
 * @Date: Create in 10:16 2018/7/2
 * @Modify By:
 */
public class Student {
	//构造私有
	private Student() {
	}

	//在成员位置创建一个对象, 对外需要隐藏,需要加private
	// 另外一个,静态方法访问静态成员变量,需要加静态
	private static Student s = new Student();

	//对外提供一个公共的方法
	public static Student getStudent() {
		return s;
	}
}
