/**
 * @Auther: Joinlin
 * @Descriptional: 定义第一个数组, 定义完毕后，给数组元素赋值。赋值完毕后，在输出数组名称和元素。
 * 定义第二个数组,定义完毕后，给数组元素赋值。赋值完毕后，在输出数组名称和元素。
 * 定义第三个数组,把第一个数组的地址值赋值给它。(注意类型一致)，通过第三个数组的名称去把元素重复赋值。
 * 最后，再次输出第一个数组数组名称和元素。
 * @Date: Create in 15:09 2018/6/5
 * @Modify By:
 */
public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] arrs=new int[3];
		arrs[0]=10;
		arrs[1]=20;
		arrs[2]=30;
		System.out.println(arrs);
		System.out.println(arrs[0]);
		System.out.println(arrs[1]);
		System.out.println(arrs[2]);
		System.out.println("----------");
		//定义第三个数组
		int[] arr3 =  arrs;
		arr3[0] = 100;
		arr3[1] = 200;
		System.out.println(arrs);
		System.out.println(arrs[0]);
		System.out.println(arrs[1]);
		System.out.println(arrs[2]);
	}
}
