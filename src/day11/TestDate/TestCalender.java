package day11.TestDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar  = Calendar.getInstance();
		Date curDate = new Date();
		System.out.println(format.format(curDate));
		
		//默认值问题
		calendar.set(2017, Calendar.SEPTEMBER, 5);
		calendar.add(Calendar.YEAR, 2);
		calendar.add(Calendar.MONTH, -2);
		curDate =calendar.getTime();
		System.out.println(format.format(curDate));
	}
}
