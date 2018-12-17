package systemDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: System类包含一些有用的类字段和方法。它不能被实例化。
 * <p>
 * 方法：
 * public static void gc()：运行垃圾回收器。
 * public static void exit(int status)
 * public static long currentTimeMillis()
 * public static void arraycopy(Object src,int srcPos,
 * Object dest,int destPos,int length)
 * @Date: Create in 15:27 2018/6/12
 * @Modify By:
 */
public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person("林志玲", 18);
		System.out.println(person);
		person = null;
		System.gc();
	}
}
