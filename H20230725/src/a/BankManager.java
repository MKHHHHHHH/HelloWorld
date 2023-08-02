package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.border.EmptyBorder;

public class BankManager {
	List<Bank> bank = new ArrayList<>();
	Scanner scn = new Scanner(System.in);
	
	
//	public int getDpoNext() {
//		String wow = null;
//		for (int i = 0; i < bank.size(); i++) {
//			if (bank.get(i).getNum() == wow) {
//				wow = bank.get(i).getNum();
//			}
//		}
//		return wow + 
//	}

	public void printMenu() {
		System.out.println("[---은행계좌관리---]");
		System.out.println("1.계좌생성 2.입금 3.출금 4.조회");
		System.out.print("입력하세요>>");
	}

	public void createAccount() {
		System.out.println("[---계좌생성---]");
		System.out.print("계좌번호 입력>> ");
		String num = scn.nextLine();
		System.out.print("이름 입력>> ");
		String name = scn.nextLine();
		System.out.print("비밀번호 입력>> ");
		String pw = scn.nextLine();
		System.out.print("입금액 입력>>");
		String balance = scn.nextLine();

		for (int i = 0; i < bank.size(); i++) {
			if (balance.isEmpty()) {
				bank.add(new Bank(num, name, pw));
			} else {
				bank.add(new Bank(num, name, pw, balance));
			}
		}
	}

	public void deposit() {

		System.out.println("[---입금---]");
		System.out.print("계좌번호 입력>> ");
		String num = scn.nextLine();

		for (int i = 0; i < bank.size(); i++) {
			if (bank.get(i).getNum().equals(num)) {
				System.out.println("입금액을 적으세요");
				String balance = scn.nextLine();
				String getbal = bank.get(i).getBalance();
				String bal = getbal + balance;
				bank.get(i).setBalance(bal);
			} else {
				System.out.println("계좌번호가 맞지 않습니다.");
			}
		}
	}

	public void widthraw() {
		for (int i = 0; i < bank.size(); i++) {

		}
	}

	public void list() {

		System.out.println("[---조회기능---]");
		System.out.print("계좌번호 입력>> ");
		String num = scn.nextLine();

		for (int i = 0; i < bank.size(); i++) {
			if (bank.get(i).getNum().equals(num)) {
				System.out.println(bank.get(i).toString());
			} else {
				System.out.println("계좌번호가 맞지 않습니다.");
			}
		}

	}

	public void list1() {

		for (int i = 0; i < bank.size(); i++) {
			System.out.println(bank.get(i).toString());

		}
	}
}