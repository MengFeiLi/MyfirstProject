package day11;

public class TestBox {
	public static void main(String[] args) {
		int i=10;
		Integer k = i;
		System.out.println(k);
		
		//String ---- > int(Integer)
		//NumberFormatException
		String s ="123";
		k = Integer.parseInt(s);
		System.out.println(k);
		
		//int ---> String
//		String str = i+"";
//		System.out.println(str);
		
		System.out.println(Integer.class);
		System.out.println(int.class);
	}
}
