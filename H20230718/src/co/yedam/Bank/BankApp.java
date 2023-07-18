package co.yedam.Bank;

import java.util.Scanner;

public class BankApp {
	
	// 싱글톤 방식.
	private static BankApp instacne = new BankApp();
	
	Scanner scn = new Scanner(System.in);
	// 필드
	Account[] acc;
	int accNum = 0;

	// 생성자
	private BankApp() {
		acc = new Account[10];
	}
	
	public static BankApp getInstacne() {
		return instacne;
	}

	// 메소드
	// 등록기능
	void registerAccount(Account www) {
		acc[accNum] = www;
		accNum++;
	}

	// 입금기능
	void deposit(Account bbb) {
//		for (int i = 0; i < accNum; i++) {
//			if(acc[i].money.equals(abc){
//				
//			}
//		}
	}

	// 출금기능
	void withdraw() {
		System.out.println("출금");
		System.out.println("출금할 금액을 입력해주세요 >> ");
		int minus = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < accNum; i++) {

		}
	}

	// 잔액확인기능
	void checkBalance() {
		for (int i = 0; i < accNum; i++) {
			System.out.printf("남은 잔액은: %d \n", acc[i].money);
		}
	}

	// 목록확인기능
	void accountList() {
		for (int i = 0; i < accNum; i++) {
			System.out.println(acc[i].showInfo());
		}
	}

	public void deposit(String abc, int atm) {
		// TODO Auto-generated method stub
		
	}
}
