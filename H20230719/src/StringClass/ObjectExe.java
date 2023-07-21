package StringClass;

public class ObjectExe {
	public static void main(String[] args) {
		String[] numbers = { "9802031234567", "050203234567", //
				"980203-1234567", "980203-2234567", //
				"020203 1234567", "030203 2234567" };
		
		// 주민번호 뒷자리의 첫번째 값 ( 성별: 1,3 남자/ 2,4 여자)
		for(String num : numbers) {
			System.out.println(checkGender(num));
		}
	}
	
	static String checkGender (String no) {
		String numbers = no.substring(0,1);
		char gender = no.charAt(7);
		
		switch() {
		
		}
		return "남";
	}
}
