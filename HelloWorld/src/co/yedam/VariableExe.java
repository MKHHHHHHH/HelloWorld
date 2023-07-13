package co.yedam;

public class VariableExe {
	public static void main(String[] args) {
		// 정수형.
		int num1 = 100; // 4byte
		System.out.println(Integer.MAX_VALUE);
		long num2 = 200; // 8byte
		System.out.println(Long.MAX_VALUE);
		
		byte num3 = 30; // -128 ~ 127만 담을 수 있음 (8bit)
		num3 = 126;
		for(int i= 1; i< 10; i++) {
			System.out.println(num3++);
		}
		short num4 = 32767; // 
		System.out.println(Short.MAX_VALUE *2);
		
		int result = num3 + 30;
		result = 1234567890;
		
		System.out.println(result);
		
		char chr = 97; // 2byte 65536개의 유니코드.
		for(int i = 1; i<=25; i++) {
			System.out.println(chr++);
		}
		System.out.println(chr); // 형변환.
		
		
	}
}
