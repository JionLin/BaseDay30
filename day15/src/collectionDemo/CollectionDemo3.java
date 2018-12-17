package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther: Joinlin
 * @Descriptional: 集合的遍历。其实就是依次获取集合中的每一个元素。
 * @Date: Create in 9:44 2018/6/13
 * @Modify By:
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("javaee");
		//进行转换成数组
		Object[] objects = c.toArray();
		//把数组进行遍历
		for (int x=0;x<objects.length;x++){
			//进行向下转型成String
			String s=(String)objects[x];
			//然后在输出
			System.out.println(s);
		}
	}
}
