package day09.finala;

//定义了一个不可被修改的类(类不可被继承)
final public /*final*/ class FinalClass {

	//被修饰为final的成员变量必须赋初值
	public final int i = 100;

	//定义普通方法
	public void method(){

		/*
		//尝试修改成员变量的值
		i = 300;//(不可以)
		*/

		//定义局部变量，并且把局部变量的值赋成10
		int a = 10;
		//尝试修改局部变量的值(可以再次修改变量a的值)
		a = 30;


		/*

		//定义final修饰的局部变量，并赋值成100
		final int b = 100;//定义了常量b
		//尝试修改final的局部变量的值(不可以)
		b = 200;
		
		*/
	}

}
