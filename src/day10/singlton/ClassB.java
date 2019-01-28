package day10.singlton;

public class ClassB {
	private static ClassB instance;
	private ClassB()
	{
		
	}
	public static ClassB getInstance()
	{
		if(instance == null)
		{
			instance = new ClassB();
		}
		return instance;
	}
}
