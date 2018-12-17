/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:46 2018/6/5
 * @Modify By:
 */
public class HomeWork {
	public static void main(String[] args) {
		int x=100;
		int result = standardIfElse(x);
		System.out.println(result);
	}
	public static int standardIfElse(int i){
		if (i<10)
			return i*100;
		else
			return i*10;
	}
}
