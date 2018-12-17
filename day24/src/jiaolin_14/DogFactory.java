package jiaolin_14;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:40 2018/7/2
 * @Modify By:
 */
public class DogFactory implements Factory {
	@Override
	public Animal createAnimal() {
		return new Dog();
	}
}
