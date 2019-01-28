package day03;

public class Test11 {
	public static void main(String[] args) {
		int i  =10;
		//如果满足条件 会执行作用域1中的代码
		//作用域1中可以是多行代码
		//否则跳过作用域1
		if(i<11)
		{
			//作用域1
			System.out.println("test");
			System.out.println("test");
			System.out.println("test");
			System.out.println("test");
			System.out.println("test");
			
		}
		System.out.println("end");
	}
}
