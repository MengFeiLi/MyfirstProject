package day03;

public class HomeWork {
	public static void main(String[] args) {
//		 1 定义一个char类型的变量（a-z） 将其转换成对应的大写字母后输出
//		 2 定义一个char类型的变量（A-Z） 将其转换成对应的小写字母后输出
		
		System.out.println((int)'a');
		System.out.println((int)'A');
		char a = 'k';
		System.out.println((char)(a-('a'-'A')));
		char b = 'A';
		System.out.println((char)(b+('a'-'A')));
	}
}
