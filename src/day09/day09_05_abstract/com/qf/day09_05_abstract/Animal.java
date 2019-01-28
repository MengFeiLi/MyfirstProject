package day09.day09_05_abstract.com.qf.day09_05_abstract;

//Animal是一个比较抽象的类别，应该定义成抽象的类
public abstract class Animal {

	//定义叫方法speak()，因为每一个动物子类别叫的方式都不一样，
	//在具体到子类别之前，怎么叫的是不具体的，所以该方法就应该被定义成抽象方法

	//定义抽象方法(不是说方法体里面没有写代码就是没有方法体)
	public abstract void speak();/*{
		
	}*/
}
