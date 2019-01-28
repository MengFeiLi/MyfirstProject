package day09.day09_05_abstract.com.qf.day09_05_abstract.other;

import day09.day09_05_abstract.com.qf.day09_05_abstract.Animal;

//家禽类别
abstract public class HomeAnimal extends Animal {

	//如果子类被定义为抽象的，此时子类中不一定非要实现父类中的抽象方法

	/*
	//如果子类是非抽象的，那么一定要保证实现抽象父类中的抽象方法
	@Override
	public void speak() {

	}
    */

	//定义抽象的方法
	abstract public void goHome();

	//在抽象类中也可以有非抽象的方法
	public void eat(){
		System.out.println("吃饲料");
	}

}
