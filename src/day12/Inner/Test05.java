package day12.Inner;

public class Test05 {
	public static void main(String[] args) {
		//局部内部类
//		class TestClass implements A{
//			@Override
//			public void method() {
//				// TODO Auto-generated method stub
//				
//			}
//		}
//		A a = new TestClass();
		
		
		//A a = new TestClass implements A{}
		A a = new  A() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//A a = new TestClass();  A a = new TestClass implements A{}
	}
}
interface A{
	public void method();
}
