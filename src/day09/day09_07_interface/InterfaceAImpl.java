package day09.day09_07_interface;

//InterfaceAImpl类是InterfaceA接口的实现类(接口的子类)
public /*abstract*/ class InterfaceAImpl implements InterfaceA,InterfaceB{


	//实现接口中的抽象方法(重写)
	public void methodA(){//说明接口中的方法是public的，同时说明接口中的方法是abstract
		System.out.println("在实现类中实现了接口中的抽象方法");
	}

	public void methodB(){//实现接口B中的抽象方法
		System.out.println("实现类实现接口B中的抽象方法");
	}



	public void methodB2(){

	}


}
