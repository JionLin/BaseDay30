/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 15:47 2018/6/5
 * @Modify By:
 */
public class Array2Demo {
	public static void main(String[] args) {
		//定义数组
		int[][] arr = {{1, 2, 3}, {4, 5}, {6}};

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("--------");
		System.out.println(arr[0][0]); //1
		System.out.println(arr[1][0]); //4
		System.out.println(arr[2][0]); //6
		System.out.println("--------");

		System.out.println(arr[0][1]); //2
		System.out.println(arr[1][1]); //5
		System.out.println("--------");
		//越界
//		System.out.println(arr[2][1]); //错误
		System.out.println("--------");

	}
}
