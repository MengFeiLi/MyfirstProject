package day11.TestDate;

import java.util.Arrays;
import java.util.Date;

public class MyDate extends Date{
	@Override
	public int compareTo(Date anotherDate) {
		// TODO Auto-generated method stub
		if(this.getMonth()>anotherDate.getMonth())
		{
			return 1;
		}
		if(this.getMonth()<anotherDate.getMonth())
		{
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		date1.setYear(2018);
		date1.setMonth(2);
		MyDate date2 = new MyDate();
		date2.setYear(2017);
		date2.setMonth(5);
		int result = date1.compareTo(date2);
		System.out.println(result);
		
		MyDate date3 = new MyDate();
		date3.setYear(2012);
		date3.setMonth(1);
		
		MyDate date4 = new MyDate();
		date4.setYear(2019);
		date4.setMonth(9);
		
		MyDate date5 = new MyDate();
		date5.setYear(2014);
		date5.setMonth(6);
		
		MyDate[] dates = {date1,date2,date3,date4,date5};
		
		for(int j = 0;j< dates.length;j++)
		{
			System.out.println(dates[j].getYear()+","+dates[j].getMonth());
		}
		System.out.println("------------------");
		Arrays.sort(dates);
		for(int j = 0;j< dates.length;j++)
		{
			System.out.println(dates[j].getYear()+","+dates[j].getMonth());
		}
		
	}

}
