package day11.TestDate;

import java.util.Arrays;
import java.util.Date;

public class TestCompare {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date();
		
		d1.setYear(2017);
		d2.setYear(2017);
		int result = d1.compareTo(d2);
		System.out.println(result);
		
		Date[] arr= new Date[6];
//		Person[] arr= new Person[6];
		for(int i = 0;i< arr.length;i++)
		{
			Date d = new Date();
			d.setYear(2017-i);
			
//			Person d = new Person();
			
			arr[i] = d;
		}
		Arrays.sort(arr);
		System.out.println("-----------------------");
		for(int j = 0;j< arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		
		
	}
}
class Person implements Comparable
{
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

