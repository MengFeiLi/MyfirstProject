package day10.StringTest;

public class Test02 {
	public static void main(String[] args) {
		String str = "abc";
		//0-length()-1
//		System.out.println(str.charAt(3));
		
		String filename = "test.txt";
		System.out.println(filename.endsWith(".txt"));
		System.out.println(filename.startsWith("test"));
		
		String str2 ="aBc";
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		//formart
		//java.util.IllegalFormatConversionException
		String s ="hello %s %d";
		String newString  =String.format(s, "sadf",3);
		System.out.println(newString);
		
		String str3 ="aBcc";
//		System.out.println(str3.lastIndexOf("cc"));
		System.out.println(str3.indexOf('c',0));
		
	}
}
