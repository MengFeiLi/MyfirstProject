package day12.Inner;

public class Test04 {
	public static void main(String[] args) {
		Person2 p2 = new Person2();
		p2.method();
//		System.out.println(p.b);
	}
}
class Person2{
	public int a = 10;
	public void method()
	{
	    int b=11;
		System.out.println(b);
	}

}
