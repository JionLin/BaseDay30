/**
 * @Auther: Joinlin
 * @Descriptional: 练习题：
 * for(int x=1; x<=10; x++) {
 * if(x%3==0) {
 * //在此处填写代码
 * }
 * System.out.println(“Java基础班”);
 * }
 * <p>
 * 我想在控制台输出2次:“Java基础班“
 * break;
 * 我想在控制台输出7次:“Java基础班“
 * continue;
 * 我想在控制台输出13次:“Java基础班“
 * System.out.println(“Java基础班”);
 * @Date: Create in 11:04 2018/6/5
 * @Modify By:
 */
public class BreakDemo2 {
	public static void main(String[] args) {
		/*for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//在此处填写代码 2  7  13
//				break;
				continue;
//				System.out.println("基础");
			}
			System.out.println("基础");*/
		for (int i=0;i<100;i++){
			if (i==74) break;
			if (i%9!=0)continue;
			System.out.println(i+"");
		}
	}
}
