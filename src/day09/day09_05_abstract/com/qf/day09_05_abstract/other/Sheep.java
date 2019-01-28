package day09.day09_05_abstract.com.qf.day09_05_abstract.other;

public class Sheep extends HomeAnimal{

	private /*abstract*/ float weight;//羊的重量

	@Override
	public void speak() {
		System.out.println("咩咩");
	}

	@Override
	public void goHome() {
		System.out.println("四脚走回家");
	}

}
