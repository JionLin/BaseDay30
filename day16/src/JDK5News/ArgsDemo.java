package JDK5News;

/**
 * @Auther: Joinlin
 * @Descriptional: 可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 修饰符 返回值类型 方法名(数据类型…  变量名){
 * <p>
 * }
 * <p>
 * 注意：
 * 这里的变量其实是一个数组
 * 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 * @Date: Create in 9:09 2018/6/14
 * @Modify By:
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int sum = getSum(a, b,30,40,30);
		System.out.println(sum);
	}

	public static int getSum(int...a) {
		int s = 0;
		for (int x : a) {
			s += x;
		}
		return s;
	}
}
