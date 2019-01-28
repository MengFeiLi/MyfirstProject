package day05;

public class Test03 {
	public static void main(String[] args) {
		
		//k叫做值传递 s叫做引用传递
		//基本数据类型传的都是值 而引用类型传的都是地址 有特殊的
		//String 传的也是地址 但是有个不变模式
		
		int k = 88;
		double[] s  ={2.0,2,63.2,55.3};
//		s[1]=1.0;
		someMethod(k, s);
		System.out.println(k);
		for(int i= 0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	public static void someMethod(int i,double[] score)
	{
		
		i = 77;
		score[1]=1.0;
	}
}
