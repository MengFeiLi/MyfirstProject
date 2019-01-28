package day09.day09_05_abstract.com.qf.day09_05_abstract;

public class Test {

	public static void main(String[] args) {

		//Animal animal = new Animal();//不能创建抽象类的对象

		//通过创建子类别的对象来实现创建动物对象
		Cat cat = new Cat();

		//抽象类虽然不能够直接创建对象，但是可以作为数据类型来使用
		Animal cat2 = new Dog();//自动类型转换(向上转型)




		//创建抽象类的子类的对象，并且调用相关的实现后的方法
//		Cat cat3 = new Cat();
//		cat3.speak();
//
//		Dog dog = new Dog();
//		dog.speak();

	}

}
