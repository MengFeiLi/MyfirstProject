package day09.day10_02_inner_noname_impl;


import day09.day10_02_inner_noname.MyInterface;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void method() {
		System.out.println("MyInterface接口的子类的method方法被调用");
	}

}
