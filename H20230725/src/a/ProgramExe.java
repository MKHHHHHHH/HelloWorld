package a;

import java.util.Scanner;

public class ProgramExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		ProgramManager manager = new ProgramManager();

		while (run) {
			manager.printMenu();
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				manager.productAdd();
			}
			if (menu == 2) {

			}
			if (menu == 3) {

			}
			if (menu == 4) {

			}
			if (menu == 5) {
				System.out.println("종료합니다");
				run = false;
			}
		}
		System.out.println("END");
	}
}
