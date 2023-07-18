package co.yedam.Bank;

import java.util.Scanner;

public class BankAppExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		BankApp ba = BankApp.getInstacne(); // BankApp();
//		Account acc = new Account();

		while (run) {
			System.out.println("1.등록 2.입금 3.출금 4.잔액 5.계좌목록");
			System.out.println("선택하세요 >> ");
			int select = Integer.parseInt(scn.nextLine());

			if (select == 1) {
				System.out.println("등록기능");
				System.out.println("계좌번호를 입력하세요>> ");
				String bb = scn.nextLine();
				System.out.println("예금주를 입력하세요>> ");
				String hh = scn.nextLine();
				System.out.println("입금액을 입력하세요>> ");
				int mm = Integer.parseInt(scn.nextLine());

				Account www = new Account(bb, hh, mm);
				ba.registerAccount(www);
			} else if (select == 2) {
				System.out.println("계좌입력");
				String abc = scn.nextLine();
				System.out.println("입금액 입력");
				int atm = Integer.parseInt(scn.nextLine());
				ba.deposit(abc,atm);
				
				Account bbb = new Account(abc,atm);
				ba.deposit(bbb);
			} else if (select == 3) {
				ba.withdraw();
			} else if (select == 4) {
				System.out.println("계좌번호를 입력하세요");
				int zz = Integer.parseInt(scn.nextLine());
				ba.checkBalance();
			} else if (select == 5) {
				ba.accountList();
			}
		}
	}
}
