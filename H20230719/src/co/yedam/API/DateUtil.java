package co.yedam.API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String dateToStr (Date date) {
		// Date -> String 생성.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
		
	}
	
	public static String dateToStr (Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	public static Date strToDate (Date date, String qq) {
		SimpleDateFormat sdf = new SimpleDateFormat(qq);
		Date time = new Date();
		
		try {
			time = sdf.parse("2023-03-05");
		} catch (ParseException e) {
			e.getStackTrace();
		}
		return sdf.format(date);
	}
}
