package day11.TestDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalender01 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String str = "2017-2-28";
		//单例
		Calendar c1 = Calendar.getInstance();
		//String -- > Date 通过format中的parse方法 付给 setTime（）方法
		c1.setTime(format.parse(str));
		
//		System.out.println(c1);
		
		String str1 = "2016-6-21";
		Calendar c2 = Calendar.getInstance();
		//String -- > Date 通过format中的parse方法 付给 setTime（）方法
		c2.setTime(format.parse(str1));
		System.out.println(c1.after(c2));
		
		System.out.println(c1.getTimeInMillis());
		
		Calendar c3 = Calendar.getInstance();
		c3.setTimeInMillis(1488211200000l);
		//通过 Calendar中的getTime方法得到Date格式 然后转换为String
		System.out.println(format.format(c3.getTime()));
	}
}
