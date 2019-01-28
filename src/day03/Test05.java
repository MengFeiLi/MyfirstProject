package day03;

public class Test05 {
	public static void main(String[] args) {
		int i = 20;
		int j = 40;
		boolean result = i<40 || j<20;
		System.out.println(result);
		
		boolean result1 = i<40 && j<20;
		System.out.println(result1);

		System.out.println(1>0 || 1/0>3);
	}
}
