package generic;

/**
 * @Auther: Joinlin
 * @Descriptional: 实现类在实现接口的时候
 * 第一种情况：已经知道该是什么类型的了
 * 第二种情况:还不知道是什么类型的时候
 * @Date: Create in 16:44 2018/6/13
 * @Modify By:
 */
/*
public class InterImpl implements Inter<String> {

	@Override
	public void show(String s) {
		System.out.println(s);
	}
}
*/
public class InterImpl<T> implements Inter<T>{

	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
