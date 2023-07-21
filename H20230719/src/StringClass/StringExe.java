package StringClass;

public class StringExe {
	public static void main(String[] args) {
		//charAt() 
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7);
		System.out.println(gender);

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		//String 객체 문자열 비교 if== || equals
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		String strVar3 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체");
		}else {
			System.out.println("다른 String 객체");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		
		// indexOf("문자열 입력")
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍"); // 문자열이 시작되는 인덱스 리턴
									// "프" = 3번째 index = 3의 값이 됨
		System.out.println(index);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바띠");
		}else {
			System.out.println("자바아님");
		}
		
		// length()
		int length = subject.length(); // length 변수값에 8이 저장됨 
		System.out.println(length);
		
		String ssw = "0010191234567";
		int hihi = ssw.length();
		
		if(hihi == 13) {
			System.out.println("번호길이가 맞습니다");
		}else {
			System.out.println("길이가 안맞습니다");
		}
		
		String name = "Lionel Messi";
		String name2 = "Cristiano Ronaldo";
		
		
	}
}
