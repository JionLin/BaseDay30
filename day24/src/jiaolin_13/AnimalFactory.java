package jiaolin_13;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:15 2018/7/2
 * @Modify By:
 */
public class AnimalFactory {
	/*public static Dog createDog() {
		return new Dog();
	}

	public static Cat createCat() {
		return new Cat();
	}*/

	public static Animal createObj(String type) {
		if (type.equals("dog")) {
			return new Dog();
		} else if (type.equals("cat")) {
			return new Cat();
		} else {
			return null;
		}
	}

}
