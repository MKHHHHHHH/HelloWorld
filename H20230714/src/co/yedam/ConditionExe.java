package co.yedam;

public class ConditionExe {
	public static void main(String[] args) {
		int score = 88;
		
		// 90이상이면 A, 80 => B, 70 => C, 그외 D
		
//		if(score > 90) {
//			System.out.println("A학점");
//		}else if(score >= 80) {
//			System.out.println("B학점");
//		}else if(score >= 70) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("D");
//		}
		
		switch (score / 10) { // 스위치 시작
		case 9:
		case 10: // case 9 or 10일 경우 아래내용 출력함
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		default:
			System.out.println("D학점");
		} // 스위치문 끝
		
		
		
		
	} // end of main() ㅎㅎ 
} // 찐막
