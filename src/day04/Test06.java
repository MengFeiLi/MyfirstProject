package day04;

public class Test06 {
	public static void main(String[] args) 
	{
//		method();  //方法的调用
//		int i = method1();
//		System.out.println(i);
//		System.out.println(method1());
//		method2(1,"DSFASD");
		int a = method4(2, 3);
		System.out.println(a);
		int b = method5(2, 3);
		System.out.println(b);
	}
	public static void method()
	{
		System.out.println("Test");
	}
	public static int method1()
	{
		System.out.println("test1");
		return 1;
	}
	
	public static int method2(int a,String b)
	{
		if(a>0)
		{
			return 1;
		}
		else if(a==0)
		{
			return 3;
		}
		else {
			return 2;
		}
	}
	//计算两个数的和
	public static int method4(int a,int b)
	{
		int k = a+b;
		return k;
	}
	
	//计算两个数的差值
	public static int method5(int a,int b)
	{
		int k = a-b;
		return k;
	}
	
}
