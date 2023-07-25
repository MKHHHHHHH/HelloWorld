package a;

import java.util.Scanner;

public class StudentMainExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		StudentManager sm = new StudentManager();

		while (run) {
			sm.printMenu();
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				sm.studentAdd1();
			}
			if (menu == 2) {
				sm.grades1();
			}
			if (menu == 3) {
				sm.gradeList();
			}
			if (menu == 4) {
				sm.money();
			}
			if (menu == 5) {
				run = false;
				sm.storeToFile();
			}

		}

	}
}
