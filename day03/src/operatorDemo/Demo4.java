package operatorDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: ++,--的练习题
 * <p>
 * 第一题：
 * int a = 10;
 * int b = 10;
 * int c = 10;
 * <p>
 * a = b++;
 * c = --a;
 * b = ++a;
 * a = c--;
 * 请分别计算出a,b,c的值
 * <p>
 * 第二题：
 * int x = 4;
 * int y = (x++)+(++x)+(x*10);
 * 请分别计算出x,y的值
 * @Date: Create in 16:24 2018/6/17
 * @Modify By:
 */
public class Demo4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;

		a = b++; //a 10 b 11 c 10
		c = --a; // 9   11   9
		b = ++a; //10  10  9
		a = c--; //9  10 8

		System.out.println("a:"+a);//9
		System.out.println("b:"+b);//10
		System.out.println("c:"+c);//8
		System.out.println("--------------");

		int x=4;

		int y = (x++)+(++x)+(x*10);
		//      4  +    6  + 60


		System.out.println("x:"+x);//6
		System.out.println("y:"+y);//70
	}
}
