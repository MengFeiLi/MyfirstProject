package day12.Inner;

public class Test03 {
	public static void main(String[] args) {
		OuterB outerB = new OuterB();
		MyInterface1 interface1 = outerB.method5();
		interface1.method3();
//		System.out.println(interface1.m);
//		System.out.println(outerB.c);
	}
}
class OuterB{
	public int i= 1;
	public static int j=9;
	public void method()
	{
		System.out.println("1111");
	}
	public static void method1()
	{
		System.out.println("22222");
	}
	//成员内部类
	public class InnerA{
		public int m = 10;
//		public static int n= 11;
		public void method3()
		{
			System.out.println("333");
		}
//		public static void method4()
//		{
//			System.out.println("4444");
//		}
	}
	//静态内部类
	public static class InnerB{
		public int m = 10;
		public static int n= 11;
		public void method3()
		{
			System.out.println("333");
		}
		public static void method4()
		{
			System.out.println("4444");
		}
	}
	public MyInterface1 method5()
	{
		//局部内部类
		//如果要使用局部内部类的外部 方法的内部的变量
	    final int c=10;
		
		class InnerC implements MyInterface1{
			public int m = 10;
//			public static int n= 11;
			public void method3()
			{
				System.out.println(m);
				System.out.println("333");
				System.out.println(c);
			}
//			public static void method4()
//			{
//				System.out.println("4444");
//			}
		}
		return new InnerC();
	}
}
interface MyInterface1{
	public void method3();
}