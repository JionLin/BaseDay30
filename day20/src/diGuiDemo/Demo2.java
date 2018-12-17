package diGuiDemo;

/**
 * @Auther: Joinlin
 * @Descriptional: 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问第二十个月的兔子对数为多少？
 * 分析：我们要想办法找规律
 * 第一个月:1
 * 第二个月:1
 * 第三个月:2
 * 第四个月:3
 * 第五个月:5
 * 第一个月+第二个月=第三个月
 * @Date: Create in 15:36 2018/6/20
 * @Modify By:
 */
public class Demo2 {
	public static void main(String[] args) {
		//使用数组
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = arr[0] + arr[1];
		for (int x = 2; x < arr.length; x++) {
			arr[x] = arr[x - 2] + arr[x - 1];
		}
		System.out.println(arr[19]);
		//使用递归
		int allFibNumber = getAllFibNumber(20);
		System.out.println(allFibNumber);
		//还有一个,使用变量
		int a=1;
		int b=1;
		for (int x=0;x<18;x++){
			int temp=a;
			a=b;
			b=temp+b;
		}
		System.out.println(b);
	}


	//规律为i-2 + i-1
	//出口为i==1或者i==2 就返回1
	private static int getAllFibNumber(int i) {
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return getAllFibNumber(i - 2) + getAllFibNumber(i - 1);
		}
	}
}
