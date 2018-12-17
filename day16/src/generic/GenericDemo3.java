package generic;

import java.util.ArrayList;

/**
 * @Auther: Joinlin
 * @Descriptional: 泛型高级(通配符)
 * ?:任意类型，如果没有明确，那么就是Object以及任意的Java类了
 * ? extends E:向下限定，E及其子类
 * ? super E:向上限定，E极其父类
 * @Date: Create in 16:54 2018/6/13
 * @Modify By:
 */
public class GenericDemo3 {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();

		ArrayList<?>list2=new ArrayList<Student>();
		ArrayList<?>list3=new ArrayList<Cat>();
		ArrayList<?>list4=new ArrayList<Animal>();
//		? extends E:向下限定，E及其子类
//		ArrayList<? extends Animal> list5=new ArrayList<Object>();
		ArrayList<? extends Animal> list6=new ArrayList<Animal>();
		ArrayList<? extends Animal> list1=new ArrayList<Dog>();
		ArrayList<? extends Animal> list7=new ArrayList<Cat>();

		//? super E:向上限定，E极其父类
		ArrayList<? super Animal> list8=new ArrayList<Object>();
		ArrayList<? super Animal> list9=new ArrayList<Animal>();
//		ArrayList<? super Animal> list10=new ArrayList<Dog>();
//		ArrayList<? super Animal> list11=new ArrayList<Cat>();
	}
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}