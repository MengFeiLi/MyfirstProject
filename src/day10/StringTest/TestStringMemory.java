package day10.StringTest;

public class TestStringMemory {
	public static void main(String[] args) {
		String str0 ="abc";//new String("abc");
		String str1 = "ab";
		String str2 = "c";
		String str3 = str1+str2;
		System.out.println(str3.equals(str0));
		
		String str4 ="aBc";
		System.out.println(str0.equals(str4));
		
		String str5 = str4.toLowerCase();
		System.out.println(str0.equals(str5));
		
		String str6 = str0.trim();
		System.out.println(str6.equals(str0));
		System.out.println(str6==str0);
		
		String str7 = new String("abc");
		
		System.out.println(str0.equals(str7));
		System.out.println("------------");
		System.out.println(str3==str0);
		System.out.println(str4==str0);
		System.out.println(str5==str0);
		System.out.println(str6==str0);
		System.out.println(str7==str0);
		
	}

}
