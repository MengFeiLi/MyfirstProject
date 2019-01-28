package day11.TestDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate02 {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		//ctrl+t查看类的结构
		//多态
		//使用SimpleDateFormat 通过参数 可以指定日期的格式
		//Date -- 》 String
		DateFormat format = new SimpleDateFormat("yyyy年MM年dd HH:mm:ss");
		String dateString = format.format(d);
		System.out.println(dateString);
		
		//String ---> Date
		//java.text.ParseException
		String datesString = "2017-02-28 13:40:45";
		
		Date tempDate = format.parse(datesString);
		System.out.println(tempDate);
		
		//思考 逆向
	}
}
