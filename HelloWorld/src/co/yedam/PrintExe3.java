package co.yedam;

import java.util.Scanner;

public class PrintExe3 {
	public static void main(String[] args) {
		// 사용자 3개 숫자(정수) 입력.
		// max계산, 평균계산 => 최대값은 90이고 평균은 80입니다.
		
		Scanner scr = new Scanner(System.in);
		
		int max = 0;
		double avg = 0;
		
		for(int i=1; i<=3; i++){
			System.out.println("숫자입력");
			String q = scr.nextLine();
			if (q > ) {
				
			}
		}
		
//		System.out.println("입력 >>");
//		String a = scr.nextLine();
//		System.out.println("입력 >>");
//		String b = scr.nextLine();
//		System.out.println("입력 >>");
//		String c = scr.nextLine();
//		
//		avg = (Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c)) /3;
//		
//		if(Integer.parseInt(a) > max) {
//			max = Integer.parseInt(a);
//		}
//		if(Integer.parseInt(b) > max) {
//			max = Integer.parseInt(b);
//		}
//		if(Integer.parseInt(c) > max) {
//			max = Integer.parseInt(c);
//		}
		System.out.printf("최대값은 %d, 평균은 %.1f 입니다", max, avg);
		
		
	}
}
