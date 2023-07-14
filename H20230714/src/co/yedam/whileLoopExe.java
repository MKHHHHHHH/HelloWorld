package co.yedam;

import java.util.Scanner; // ctrl + shift + o = 자동으로 완성

public class whileLoopExe {
	static Scanner scn = new Scanner(System.in); // 밖으로 나올시 스태틱 적용
	static int balance = 0;

	public static void main(String[] args) { // start main method

		boolean run = true;

		while (run) {
			System.out.println("1입급 2출 3잔 4끝");
			System.out.println("선택>>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				deposit();
				break;

			case 2:
				withdraw();
				break;
			case 3:
				check();
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("메뉴 다시");
			}
		}
		System.out.println("end of prog");

	} // end main method !!!!!!!!!!!!!

	public static void deposit() {
		Scanner scn = new Scanner(System.in);
		System.out.println("입금액 입력 >>");
		int deposit = Integer.parseInt(scn.nextLine());
		if (balance + deposit <= 100000) {
			System.out.println("입금 \n");
		} else {
			System.out.println("10만 초과 \n");
			return;
		}
		balance = balance + deposit;

	}

	public static void withdraw() {
		Scanner scn = new Scanner(System.in);
		System.out.println("출금액 >>");
		int withdraw = Integer.parseInt(scn.nextLine());
		if (balance >= withdraw) {
			balance -= withdraw;
		} else {
			System.out.println("잔고 부족 \n");
		}

	}

	public static void check() {
		System.out.printf("잔액 %d임 \n", balance);

	}

	// 은행: 1. 입금 2. 출금 3. 잔액 4. 종료
	// 제한금액 : 10만원, 5만원 + 5만원
	// 4만원 : 45000원 x 불가

//			while (run) { // while 시작
//				System.out.println("1. 입금 2. 출금 3. 잔액 4.종료");
//				System.out.println("선택 >>");
//			int menu = Integer.parseInt(scn.nextLine());
	//
//				if (menu == 1) {
//					System.out.println("입금액을 입력>>");
//					balance = balance + Integer.parseInt(scn.nextLine());
//					if (balance + menu > 100000) {
//						System.out.println("10만원 이상 입금 불가능합니다");
//						balance = balance + menu;
//					}
//					
//				} else if (menu == 2) {
//					System.out.println("출금액을 입력>>");
//					int w = Integer.parseInt(scn.nextLine());
	//
//					if (balance < w) {
//						System.out.println("출금액이 잔액보다 많습니다.");
//						balance = balance - w;
//					}
//				} else if (menu == 3) {
//					System.out.printf("현재 잔액은 %d 입니다.\n", balance);
//				} else {
//					run = false;
//					System.out.println("메뉴를 다시 선택하세요");
//				}
//			} // while 끝
//			System.out.println("End");

//			int balance = 0;

} // end class !!!!!!!!!!!!!
