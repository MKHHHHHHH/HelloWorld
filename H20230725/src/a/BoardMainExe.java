package a;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class BoardMainExe {
	public static void main(String[] args) {
		User user = new User();
		Boardmanager bm = new Boardmanager();
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("[---로그인---]");
			System.out.print("아이디 입력>> ");
			String id = scn.nextLine();
			System.out.print("비밀번호 입력>> ");
			String pw = scn.nextLine();
			if (user.login(id, pw)) {
				run = false;
			}

		}

		run = true; // 위에서 false선언 했기에 재선언

		while (run) {
			bm.printmenu();
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				bm.titleAdd();
			}
			if (menu == 2) {
				bm.editContent();
			}
			if (menu == 3) {
				bm.delTitle();
			}
			if (menu == 4) {
				bm.boardList();
			}
			if (menu == 5) {
				System.out.println("종료합니다.");
				run = false;
			}
		}
		System.out.println("END");

	}

}
