package ExceptionDemo;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:25 2018/6/20
 * @Modify By:
 */
public class Teacher {
	/*public void check(int score) throws MyException {
		if (score > 100 || score < 0) {
			throw new MyException("你的分数异常");
		} else {
			System.out.println("分数正常");
		}
	}*/

	public void check(int score) {
		if (score > 100 || score < 0) {
			throw new MyException("你的分数异常");
		} else {
			System.out.println("分数正常");
		}
	}
}
