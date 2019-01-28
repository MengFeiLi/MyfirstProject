package day12.classes;


public class TestInner {
	public static void main(String[] args) {
		C c = new C();
		method();
		
	}
	public static void method()
	{
		new E() {
		};
		new E() {
		};
		new E() {
		};
	}
}
class C{
	class B{
		public void a()
		{
			new E() {
			};
		}
	}
}
interface E{
	
}
