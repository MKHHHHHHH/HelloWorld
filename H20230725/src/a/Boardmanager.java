package a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boardmanager {
	Scanner scn = new Scanner(System.in);
	List<Board> board = new ArrayList<>();
	List<User> user = new ArrayList<>();
	int next = 0;
	
	public void readonly() {
		try {
			FileReader fr = new FileReader("c:/Temp/userList.txt");
			BufferedReader br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(true) {
			String str = br.readLine();
		}
	}
	
	public void nextNum() {
		for (int i = 0; i < board.size(); i++) {
			if (((Board) board.get(i)).getBnum() > next) {
				next = board.get(i).getBnum();
			}
		}
		next += 1;
	}

	public void printmenu() {
		System.out.println("[---게시판---]");
		System.out.println("1.글등록 2.글수정 3.글삭제 4.목록 5.종료 9.개인정보");
		System.out.print("선택하세요>> ");
	}

	public void titleAdd() {
		System.out.println("[---글등록---]");
		System.out.print("글번호 입력>>");
		int bnum = Integer.parseInt(scn.nextLine());
		System.out.print("제목 입력>>");
		String title = scn.nextLine();
		System.out.print("내용 입력>>");
		String content = scn.nextLine();
		System.out.print("작성자 입력>>");
		String writer = scn.nextLine();

		if (board.add(new Board(bnum, title, content, writer))) {
			System.out.println("[---등록완료---]");
		} else {
			System.out.println("등록 실패");
		}
	}

	public void editContent() {
		System.out.println("[---내용수정---]");
		System.out.print("글번호 입력>>");
		int bnum = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < board.size(); i++) {
			if (board.get(i).getBnum() == bnum) {
				System.out.print("수정할 글 내용 입력>>");
				String content = scn.nextLine();
				board.get(i).setContent(content);
				System.out.println("=== 수정완료 ===");
			}
		}
	}

	public void delTitle() {
		System.out.println("[---글삭제---]");
		System.out.print("삭제할 글번호 입력>>");
		int bnum = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < board.size(); i++) {
			if (board.get(i).getBnum() == bnum) {
				board.remove(i);
				System.out.println("=== 삭제완료 ===");
			}
		}
	}

	public void boardList() {
		System.out.println("[---목록---]");
		System.out.print("글번호 입력>>");
		int bnum = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < board.size(); i++) {
			if (board.get(i).getBnum() == bnum) {
				System.out.println(board.get(i).toString());
			}
		}

	}
}
