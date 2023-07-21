package collet.board;

import java.util.List;
import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		String logID = "";
		// 로그인 처리 => 기능 사용가능
		// 1.등록 2.목록 3.단건조회 4.삭제 9.종료

		UserApp app = new UserApp();
		BoardApp Bapp = new BoardApp();
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("[ 로그인 기능 ]");
			System.out.print("아이디 입력>> ");
			String id = scn.nextLine();
			System.out.print("비밀번호 입력>> ");
			String pw = scn.nextLine();

			if (app.login(id, pw)) {
				run = false;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} // END while

		run = true;

		while (run) {
			System.out.println("1.등록 2.목록 3.단건조회 4.삭제 9.로그아웃");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				System.out.print("글번호를 적어주세요>> ");
				int boardNo = Integer.parseInt(scn.nextLine());
				System.out.print("제목을 적어주세요>> ");
				String title = scn.nextLine();
				System.out.print("내용을 적어주세영>> ");
				String content = scn.nextLine();
				System.out.print("작성자 이름을 적어주세여>> ");
				String writer = scn.nextLine();

				if (Bapp.addBoard(new Board(boardNo, title, content, writer))) {
					System.out.println("등록 완료");
				} else {
					System.out.println("등록 불가");
				}

			}
			if (menu == 2) {
				System.out.println("[ 목록 ]");
				
				List<Board> li = Bapp.boardList();
				for (Board b : li) {
					System.out.println(b.toString());
				}
				
			}
			if (menu == 3) {
				System.out.println("[ 단건조회 ]");
				System.out.print("번호를 입력하세요>> ");
				int boardNo = Integer.parseInt(scn.nextLine());

				if (Bapp.getBoard(boardNo) == null) {
					System.out.println("번호가 틀림");
				} else {
					System.out.println(Bapp.getBoard(boardNo).toString());
				}

			}
			if (menu == 4) {
				System.out.println("[ 삭제 ]");
				System.out.print("번호를 입력하세요>> ");
				int boardNo = Integer.parseInt(scn.nextLine());

				if (Bapp.delBoard(boardNo)) {
					System.out.println("번호가 삭제되었습니다.");
				} else {
					System.out.println("번호가 틀렸습니다.");
				}

			}
			if (menu == 9) {
				System.out.println("...로그아웃...");
				System.exit(menu);
			}

		} // END While 2
		System.out.println("--- 프로그램이 종료됩니다 --- ");

	} // END MAIN
} // END CLASS
