package a;

import java.util.Scanner;

public class BankMainExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BankManager bm = new BankManager();

		while (true) {
			bm.printMenu();
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				bm.createAccount();
			}
			if (menu == 2) {
				bm.deposit();
			}
			if (menu == 3) {
				bm.widthraw();
			}
			if (menu == 4) {
				bm.list1();
			}
		}

	}
}
