package day12.Inner;

public class Test06 {
	public static void main(String[] args) 
	{
		Person1 person = new Person1();
		
		//创建了一个Person1类的匿名内部类（子类）的对象
		//Person p = new Child extends Person()
		Person1 p = new  Person1(){
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println(this.getClass());
				System.out.println("child");
			}
		};
		p.method();
		
		Person1 person2 = new Child();
		person2.method();
	}
}

class Person1{
	public void method()
	{
		System.out.println(this.getClass());
		System.out.println("person method");
	}
}
class Child extends Person1{
	public void method() {
		System.out.println(this.getClass());
		System.out.println("test child");
	};
}