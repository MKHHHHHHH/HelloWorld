package co.yedam;

public class ForCondition {
	public static void main(String[] args) {
		showCalendar(9);
	} // end of main() 메인 메소드

	public static void showCalendar(int month) { // 메소드 생성
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" }; // 배열선언

		for (int i = 0; i < days.length; i++)
			System.out.printf("%4s", days[i]);
		System.out.println(""); // 줄바꿈

// 1일의 위치 지정
		int pos = getFirstDay(month);
		for (int i = 0; i < pos; i++) {
			System.out.printf("%4s", "");
		}
		int LastDate = getLastDate(month);

// 31일까지 만듬
		for (int i = 1; i <= LastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + pos) % 7 == 0) {
				System.out.println();
			}
		}
	} // ㅁㅅㄷ 끝

	// 월 정보를 입력하면 해당월의 1일의 위치(공란을 반환)
	public static int getFirstDay(int month) { // 메소드 시작
		int pos = 1;

		switch (month) {
		case 6:
			pos = 4;
			break;
		case 7:
			pos = 6;
			break;
		}
		return pos;
	} // 메소드 끝

//	 월 정보를 입력하면 해당월의 마지막날을 반환
//	public static int getLastDate(int month) { // 시작
//		int lastDate = 31;
//		
//		switch(month) {
//		case 2: lastDate = 28; break; 
//		case 4:
//		case 7:
//		case 10: lastDate = 30; break;
//		case 11:
//		}
//		return lastDate;
//
//	 } // 메소드 끝

	public static int getLastDate(int month) {
		int lastDate = 31;

		if (month == 2) {
			lastDate = 28;
		} else if (month == 4) {
			lastDate = 30;
		} else if (month == 6) {
			lastDate = 30;
		} else if (month == 9) {
			lastDate = 30;
		} else if (month == 11) {
			lastDate = 30;
		}
		return lastDate;

	}

} // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
