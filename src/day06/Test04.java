package day06;

public class Test04 {
	//求1+2+3+4+....i的和
	public static void main(String[] args) {
		int result = sum(3);
		System.out.println(result);
	}
	public static int sum(int i)
	{
		if(i==1)
		{
			return 1;
		}
		return i+sum(i-1);
	}
}
