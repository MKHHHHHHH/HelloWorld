package StringClass;

public class StringMethod {
	public static void main(String[] args) {
		java.lang.String ssn = "010624-1230123";
		char gender = ssn.charAt(7);
		
		switch(gender) {
		case 1:
			System.out.println("x");
			break;
		case 2:
			System.out.println("x");
			break;
		case 3:
			System.out.println("고츄");
			break;
		case 4:
			System.out.println("여자");
			break;
		}
		
	}
}
