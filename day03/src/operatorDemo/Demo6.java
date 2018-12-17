package operatorDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: 面试题：
 * short s=1;s = s+1;
 * <p>
 * short s=1;s+=1;
 * 上面两个代码有没有问题，如果有，那里有问题。
 * <p>
 * 为什么第二个木有问题呢?
 * 扩展的赋值运算符其实隐含了一个强制类型转换。
 * <p>
 * s += 1;
 * 不是等价于 s = s + 1;
 * 而是等价于 s = (s的数据类型)(s + 1);
 * @Date: Create in 16:39 2018/6/17
 * @Modify By:
 */
public class Demo6 {
	public static void main(String[] args) {
//		short s = 1;
//		s= s + 1; //先运行右边,由于s为short类型,1为int类型, s+1应该转换为int类型,进行了隐式转换
//		//System.out.println(s);

		short s = 1;
//		s += 1; //好像是 s = s + 1;  操作符
		s=(short)(s+1);//等同于s+=1;
		System.out.println(s);
	}
}
