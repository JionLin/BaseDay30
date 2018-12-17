/**
 * @Auther: Joinlin
 * @Descriptional: 练习：用while循环实现
 * 左边：求出1-100之和
 * 右边：统计水仙花数有多少个
 * <p>
 * 初始化语句;
 * while(判断条件语句) {
 * 循环体语句;
 * 控制条件语句;
 * }
 * @Date: Create in 10:34 2018/6/5
 * @Modify By:
 */
public class WhileDemo {
	public static void main(String[] args) {
		int count = 0;
		/*int i = 0;
		while (i <= 100) {
			count += i;
			i++;
		}*/

		int i = 100;
		while (i <= 1000) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				count ++;
			}
			i++;
		}
		System.out.println(count);
	}
}
