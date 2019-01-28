package day12.Inner;

public class Test02 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.InnerA innerA = outer.new InnerA();
		Outer.InnerB innerB = new Outer.InnerB();
		
		//创建局部内部类的对象
		//接口和多态结合 来调用局部内部类
		MyInterface interface1 = outer.otherMethod();//new InnerD;
		
		//MyInterface interface1 = new InnerD;
		interface1.fun();
		
		
	}
}
//外部类
class Outer{
	//成员内部类
	public class InnerA
	{}
	//静态内部类
	public static class InnerB{}
	
	public void fun()
	{
		//局部内部类
		class InnerC{
			
		}
		InnerC c = new InnerC();
	}
	public MyInterface otherMethod()
	{
		//局部内部类
		class InnerD implements MyInterface{
			public void fun()
			{
				System.out.println("innerD");
			}
		}
		return new InnerD();
	}
	
	public Person Test()
	{
//		Person person = new Student();
//		return person;
		return new Student();
	}
	
}
interface MyInterface{
	public void fun();
}
class Student extends Person{}
class Person{}