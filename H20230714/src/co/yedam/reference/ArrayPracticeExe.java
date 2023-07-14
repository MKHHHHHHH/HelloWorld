package co.yedam.reference;

import java.util.Scanner;

public class ArrayPracticeExe {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 학생수
		int[] scores = null; // 학생점수 저장 배열
		int sum = 0;
		int max = 0;
		int avg = 0;
		Scanner scr = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>>");
			int selectNo = Integer.parseInt(scr.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수 >>");
				studentNum = Integer.parseInt(scr.nextLine());
				scores = new int [studentNum];
				System.out.println(studentNum);
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]", i);
					scores[i] = Integer.parseInt(scr.nextLine());
				}
			} else if (selectNo == 3) {
				System.out.println(scores);
			} else if (selectNo == 4) {
				for(int i=0; i < scores.length; i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
						avg = sum / scores.length;
					}
					System.out.printf("최고 점수:%d, 평균 점수: %d", max, avg);
				}
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("end of prog.");

	} // END MAIN
} // END CLASS
