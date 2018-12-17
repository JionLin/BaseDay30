import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
 * 在传递过程中需要加密，加密规则如下：
 * 首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
 * 最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
 * 然后，把加密后的结果在控制台打印出来。
 * @Date: Create in 16:49 2018/6/5
 * @Modify By:
 */
public class Array2Test4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个小于8位数的整数{}");
		int result = scanner.nextInt();
		String jiaMi = jiaMi2(result);
		System.out.println(jiaMi);

	}

	public static String jiaMi(int number) {
		//把数据转换为数组
		int[] arrs = new int[8];

		int index = 0;
		//把数组进行掉换
		while (number > 0) {
			arrs[index] = number % 10;
			index++;
			number /= 10;
		}
		//把每个数据加5,然后除以10
		for (int x = 0; x < arrs.length; x++) {
			arrs[index] += 5;
			arrs[index] %= 10;
		}
		//把第一个和最后一个替换
		int temp = arrs[0];
		arrs[0]=arrs[index-1];
		arrs[index-1]=temp;

		//进行字符串的拼接
		String  s="";
		for (int x=0;x<index;x++){
			s+=arrs[x];
		}
		return s;
	}
	public static String jiaMi2(int number) {
		//定义数组
		int[] arr = new int[8];

		//定义索引
		int index = 0;

		//把number中的数据想办法放到数组中
		while(number > 0) {
			arr[index] = number%10;
			index++;
			number /= 10;
		}

		//把每个数据加5，然后对10取得余数
		for(int x=0; x<index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}

		//把第一位和最后一位交换
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;

		//把数组的元素拼接成一个字符串返回
		//定义一个空内容字符串
		String s = "";

		for(int x=0; x<index; x++) {
			s += arr[x];
		}

		return s;
	}
}
