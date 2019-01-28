package day11;

public class Test01 {
	public static void main(String[] args) {
		//如果在jdk1.5之前 没有自动的 装箱和拆箱
		//int -- 》 Integer 装箱
		int i =1;
		Integer j = new Integer(i);
		
		//Integer-->int    拆箱
		Integer m= 20;
		int n= m.intValue();
		fun(n);
	}
	
	//类型的查找   “就近原则” 先找最近的 然后依次往上找
	public static void fun(Object c)
	{
		System.out.println(c+"end1");
	}
	public static void fun(int c)
	{
		System.out.println(c+"end2");
	}
	public static void fun(Integer c)
	{
		System.out.println(c+"end3");
	}
}
