package ExceptionDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: finally:被finally控制的语句体一定会执行
 * 注意：如果在执行到finally之前jvm退出了，就不能执行了。
 * <p>
 * A:格式
 * try...catch...finally...
 * B:用于释放资源，在IO流操作和数据库操作中会见到
 * @Date: Create in 10:13 2018/6/20
 * @Modify By:
 */
public class Demo9 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally执行");
		}
	}
}
