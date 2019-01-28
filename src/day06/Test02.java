package day06;

public class Test02 {
	public static void main(String[] args) {
		//StackOverflowError 栈溢出
		someMethod(2);
		
	}
	//递归
	public static void someMethod(int i)
	{
		if(i<0)
		{
			System.out.println("end");
		}
		else {
			
			someMethod(--i);
		}
		System.out.println(i);
	}
}
