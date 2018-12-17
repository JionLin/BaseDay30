import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Auther: Joinlin
 * @Descriptional: Java中继承的特点：
 * A:Java只支持单继承，不支持多继承。
 * 有些语言是支持多继承，格式：extends 类1,类2,...
 * B:Java支持多层继承(继承体系)
 * @Date: Create in 11:04 2018/6/6
 * @Modify By:
 */
public class ExtendsDemo2 {
	public static void main(String[] args) {
		Son son=new Son();
		son.show();
		son.method();
	}
}
class GrandFather{
	public void show(){
		System.out.println("咱是爷爷");
	}
}
class Father extends GrandFather{
	public void method(){
		System.out.println("我是爸爸");
	}
}
class Son extends Father{

}