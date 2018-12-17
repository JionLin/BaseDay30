package list_son;


/**
 * @Auther: Joinlin
 * @Descriptional: 请用LinkedList模拟栈数据结构的集合，并测试
 * 题目的意思是：
 * 你自己的定义一个集合类，在这个集合类内部可以使用LinkedList模拟。
 * @Date: Create in 15:21 2018/6/13
 * @Modify By:
 */
public class ListDemo4 {
	public static void main(String[] args) {
		Mystack ms = new Mystack();
		ms.add("hello");
		ms.add("world");
		ms.add("java");

		while (!ms.isEmpty()) {
			System.out.println(ms.get());
		}
	}
}
