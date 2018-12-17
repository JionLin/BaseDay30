package generic;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 16:29 2018/6/13
 * @Modify By:
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool<String> obj = new ObjectTool<String>();
		obj.setObj("林青霞");
		String s = obj.getObj();
		System.out.println(s);


		ObjectTool<Integer> obj2=new ObjectTool<Integer>();
		obj2.setObj(18);
		Integer integer = obj2.getObj();
		System.out.println(integer);
	}

}
