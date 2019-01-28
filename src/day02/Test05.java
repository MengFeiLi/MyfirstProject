package day02;

public class Test05
{
	public static void main(String[] args) 
	{
		//作用域3
		char b = 'A';
		int c = b-5;
		System.out.println(c);

//		int i = 0;
		if(true)
		{
			//作用域1
			int i = 0;
			System.out.println(i);

		}

		if(false)
		{
			//作用域2
			int i = 0;
		}
	}
}
