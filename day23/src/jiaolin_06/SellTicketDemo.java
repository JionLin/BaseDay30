package jiaolin_06;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:59 2018/6/26
 * @Modify By:
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket sellTicket1=new SellTicket();
		SellTicket sellTicket2=new SellTicket();
		SellTicket sellTicket3=new SellTicket();
		sellTicket1.setName("窗口1");
		sellTicket2.setName("窗口2");
		sellTicket3.setName("窗口3");
		sellTicket1.start();
		sellTicket2.start();
		sellTicket3.start();
	}
}
