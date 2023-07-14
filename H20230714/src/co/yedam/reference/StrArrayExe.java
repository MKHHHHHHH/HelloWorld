package co.yedam.reference;

import java.util.Scanner;

public class StrArrayExe {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		String[] strAry = new String[3]; // 크기가 3임
		int[] scores = new int[3];

		for (String str : strAry) {
			System.out.println(str);
		}
		for (int i = 0; i < strAry.length; i++) {
			System.out.println("이름>>");
			strAry[i] = scr.nextLine();
			System.out.println("점수>>");
			scores[i] = Integer.parseInt(scr.nextLine());

		}

//		System.out.println("검색하고 싶은 학생의 이름을 입력>>>");
//		String searchName = scr.nextLine();
		// 최고점수를 구하고. 학생의 이름.
		int maxScore = 0;
		String maxName = "";

		for (int i = 0; i < strAry.length; i++) {
			if (maxScore < scores[i]){
				maxScore = scores[i];
				maxName = strAry[i];
			}
		}
		System.out.printf("이름은 %s, 점수는 %d \n", maxName, maxScore);

	}
}
