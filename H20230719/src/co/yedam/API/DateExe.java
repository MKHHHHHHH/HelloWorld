package co.yedam.API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일 hh시 mm분 ss초");
		
		Date today = new Date();
		// date -> string
		System.out.println(sdf.format(today));
		
		Date tday = new Date();
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		try {
		tday = sdf.parse("2023-01-10 10:10:20");
		System.out.println(tday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String result = DateUtil.dateToStr(today, "yyyy MM dd");
		System.out.println(result);
		
		
		
		
		
		// 문자열(2023-03-05) =>
		Date dday = DateUtil.strToDate("2023-03-05");
		
	} // END MAIN
}


