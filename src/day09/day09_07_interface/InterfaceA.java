package day09.day09_07_interface;

//用interface关键字定义接口(对于接口也可以被称为接口类)
public interface InterfaceA {

	//接口中不能直接非抽象的方法
	/*
	void methodA(){

	}
	*/

	//void methodA();//语法是合法的。在接口也是抽象方法(编译器会自动添加abstract关键)

	//abstract void methodA();//等同于上一种写法，接口中的抽象方法的修饰符是public

	//private void methodA();//语法报错。接口中的抽象方法必须是public的。

	 void methodA();//语法合法。同样的会被编译器添加上abstract关键字修饰


	//int a;//语法报错。在接口中只能有常量，但是不能有变量,对于常量必须赋值。

	int A = 10; //是常量。修饰符是public  static   final

	public static final int B = 10;//在接口定义常量的时候，3个修饰符可以任意选择显示的定义
}
