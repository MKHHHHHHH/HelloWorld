package co.yedam.board;

import java.util.Set;

public class BoardExe {

	static Board[] boards = new Board[10];
	static java.util.Scanner scn = new java.util.Scanner(System.in);

	private static void init() {
		
		boards[0] = new Board (1, "ㅁㅁ", "ㄴㄴ", "ㅂㅂ");
		boards[1] = new Board (2, "ㅠㅠ", "ㄴㄴ", "ㅂㅂ");
		boards[2] = new Board (3, "ㅋㅋ", "ㄴㄴ", "ㅂㅂ");
		boards[3] = new Board (4, "ㅍㅌㅁ", "ㄴㄴ", "ㅂㅂ");
		boards[4] = new Board (5, "ㅁㅁㄹ", "ㄴㄴ", "ㅂㅂ");
		boards[5] = new Board (6, "ㄴㅁ", "ㄴㄴ", "ㅂㅂ");
		boards[6] = new Board (7, "ㅇㅁ", "ㄴㄴ", "ㅂㅂ");
		boards[7] = new Board (8, "ㅎㅁ", "ㄴㄴ", "ㅂㅂ");
		boards[8] = new Board (9, "ㅂㅁ", "ㄴㄴ", "ㅂㅂ");
		boards[9] = new Board (10, "ㅅㅁ", "ㄴㄴ", "ㅂㅂ");
		
		
		
	}

	// 등록기능
	private static void addBoard() {
		System.out.println("등록");
		System.out.println("글번호를 입력하세요 >>");
		int aBunho = Integer.parseInt(scn.nextLine());
		System.out.println("글제목을 입력하세요 >>");
		String aZemok = scn.nextLine();
		System.out.println("글내용을 입력하세요 >>");
		String aNeyo = scn.nextLine();
		System.out.println("작성자를 입력하세요 >>");
		String aHuman = scn.nextLine();

		Board board = new Board();
		board.setBunho(aBunho);
		board.setZemok(aZemok);
		board.setNeyo(aNeyo);
		board.setHuman(aHuman);

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}

	// 목록기능
	private static void list() {
		System.out.println("\n");
		System.out.println("목록기능");
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				System.out.println(boards[i].showInfo());
				
			}
		}
	}

	private static void editBoard() {
		System.out.println("변경할 글번호");
		int ang = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBunho() == ang) {
				System.out.println("원하는 글번호를 입력해주세요");
				String modify = scn.nextLine();

			}
		}
	}

	private static void delBoard() {
		System.out.println("글 번호 입력>>");
		int delete = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBunho() == delete) {
				boards[i] = null;
				// 브레이크 없어야 삭제됨
			}
		}
	}

	private static void getBoard() {
		System.out.println("상세보기기능");

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				System.out.println(boards[i].wowInfo());
				break;
			}
		}
	}

	public static void main(String[] args) {
		init();
		boolean run = true;

		while (run) {
			System.out.println("1:글등록 2:목록 3.수정 4.삭제 5.상세보기 6.종료");
			System.out.println("선택하세요 >> ");
			int select = Integer.parseInt(scn.nextLine());
			if (select == 1) {
				addBoard();
			} else if (select == 2) {
				list();
			} else if (select == 3) {
				editBoard();
			} else if (select == 4) {
				delBoard();
			} else if (select == 5) {
				getBoard();
			} else if (select == 6) {
				run = false;
			}
		} // While 문
		System.out.println("end of prog");

	} // MAIN
} // CLASS
