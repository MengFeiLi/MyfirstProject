package day12.T;

public class MyArray <T extends Object>{
	private T[] arr;
	private int size;
	public MyArray()
	{
		//由高到低 强制转换
		arr = (T[])new Object[10];
	}
	public void add(T str)
	{
		arr[size++]=str;
	}
	public T get(int index)
	{
		return arr[index];
	}
	public int size()
	{
		return size;
	}
}
