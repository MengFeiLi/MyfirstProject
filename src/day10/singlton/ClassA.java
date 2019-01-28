package day10.singlton;

public class ClassA {
	private static ClassA instance = new ClassA();
	private ClassA()
	{}
	public static ClassA getInstance()
	{
		return instance;
	}
}
