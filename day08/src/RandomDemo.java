/**
 * @Auther: Joinlin
 * @Descriptional: //需求：我要获取一个1-100之间的随机数，肿么办?
 * @Date: Create in 10:26 2018/6/6
 * @Modify By:
 */
public class RandomDemo {
	public static void main(String[] args) {
		for (int x = 0; x < 100; x++) {
			int number = (int) ((Math.random() * 100) + 1);
			System.out.println(number);
		}
	}
}
