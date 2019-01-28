package day11.TestDate;

import java.util.Date;

public class TestDate01 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		long l=d.getTime();
		
		System.out.println(l);
		
//		Date d1 =new Date(2017, 2, 28);
//		System.out.println(d1);
	}
}
