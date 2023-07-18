package co.yedam.singleton;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExe {
	public static void main(String[] args) {
//		showCal(2023,7);
		Scanner scn = new Scanner(System.in);
		System.out.println("input>>> ");
		String str;
		
		String no = scn.next();
		String name = scn.next();
		String score = scn.next();
		System.out.println("번호: " + no + " 이름: " + name + " 점수:" + score);
		
		//str = scn.nextLine();
		//System.out.println(str);
//		while (true) {
//			if (scn.hasNext()) {
//				str = scn.next();
//				System.out.println(str);
//				continue;
//			}
//			break;
//		}
	}

	public static void showCal(int year, int month) {
		System.out.println(Calendar.MONTH);

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("날짜: " + cal.get(Calendar.DATE));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("말일: " + cal.getActualMaximum(Calendar.DATE));
		
		// 달력 그리기
		
		
	}
}