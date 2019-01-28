package day09.day09_05_abstract.com.qf.day09_05_abstract.other;


import day09.day09_05_abstract.com.qf.day09_05_abstract.Animal;

//野生动物
public abstract class WildAnimal extends Animal {

	//抽象类中可以没有抽象方法

	public void speak(){//实现抽象父类中的抽象方法

	}

	//定义非抽象方法
	public void findFood(){
		System.out.println("觅食");
	}
}
