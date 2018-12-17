/**
 * @Auther: Joinlin
 * @Descriptional: 需求：小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
 * 每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
 * 请问，经过多少天，小芳才可以存到100元钱。
 * 分析:从具体到抽象
 * 实现:从抽象到具体
 * @Date: Create in 11:10 2018/6/5
 * @Modify By:
 */
public class WhileDemo2 {
	public static void main(String[] args) {
		//每天给2.5
		double money=2.5;

		//初始化资金
		double daySum=0;

		//从第一天开始存储
		int dayCount=1;

		//小于100就退出
		int result=100;
		while (true){
			daySum+=money;
			if (daySum>result){
				System.out.println("第"+dayCount+"存储了100元");
				break;
			}
			//是5的倍数就减6
			if (dayCount%5==0){
				daySum -=6;
				System.out.println("第"+dayCount+"天花了6元钱");
			}
			dayCount++;
		}
	}
}
