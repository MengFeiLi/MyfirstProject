package day09.day09_05_abstract.com.qf.day09_05_abstract;

//创建抽象父类的子类，通过子类创建来对象
public  class Cat extends Animal{

	//抽象父类中的抽象方法一定要被非抽象的子类实现(重写)
	public void speak(){
		//如果添加了方法体，但是方法体中没有语句，也叫做实现了父类的抽象方法
		System.out.println("喵喵");
	}

}
