package list_son;

import java.util.LinkedList;

/**
 * @Auther: Joinlin
 * @Descriptional: 进行一个linkedList的集合类的工具类
 * @Date: Create in 15:21 2018/6/13
 * @Modify By:
 */
public class Mystack {
	private LinkedList linkedList;

	public Mystack() {
		linkedList = new LinkedList();
	}

	//进行添加
	public void add(Object o) {
		linkedList.addFirst(o);
	}

	//进行删除
	public Object get() {
		return linkedList.removeFirst();
	}

	//判断是否为空
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}


}
