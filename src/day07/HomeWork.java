package day07;

public class HomeWork {
	public static void main(String[] args) {
		dec2Binary(5);
	}
	//十进制转二进制
	public static void dec2Binary(int num)
	{
		if(num==0)
		{
			return;
		}
		dec2Binary(num/2);
		System.out.print(num%2);
	}
}
