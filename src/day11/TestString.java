package day11;

public class TestString {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "a"+"bc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = "a";
		String s4 = "bc";
		//String 的引用+引用 会创建对象
		//StringBuffer
		//String
		String s5 = s3+s4;
		System.out.println(s1==s5);
	}
}
