package co.micol.privateproject.menu;

import java.util.List;
import java.util.Scanner;

import co.micol.privateproject.board.service.BoardService;
import co.micol.privateproject.board.service.BoardVO;
import co.micol.privateproject.board.serviceImpl.BoardServiceImpl;
import co.micol.privateproject.member.service.MemberService;
import co.micol.privateproject.member.service.MemberVO;
import co.micol.privateproject.member.serviceImpl.MemberServiceImpl;

public class MainMenu {
	private Scanner scn = new Scanner(System.in);
	private BoardService bs = new BoardServiceImpl();
	private MemberService ms = new MemberServiceImpl();
	boolean w = true;

	private void memberTitle() {
		System.out.println("=== 회원창 ===");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 회원탈퇴");
		System.out.println("4. 종료");
		System.out.println("=============");
		System.out.print("메뉴를 선택하세요 >> ");
	}

	private boolean memberLogin() { // 로그인 기능
		MemberVO member = new MemberVO();
		System.out.println("=== 로그인 ===");
		System.out.print("아이디 입력 >> ");
		int id = Integer.parseInt(scn.nextLine());
		System.out.print("비밀번호 입력 >> ");
		String pw = scn.nextLine();
		member.setMemberId(id);
		member.setMemberPassword(pw);
		if (ms.memberLogin(member)) {
			System.out.println("로그인 성공");
			return true;
		}
		return false;
	}

	private void memberSignUp() { // 회원가입 기능
		MemberVO member = new MemberVO();
		System.out.println("=== 회원가입 ===");
		System.out.print("아이디 입력 >> ");
		int id = Integer.parseInt(scn.nextLine());
		System.out.print("비밀번호 입력 >> ");
		String pw = scn.nextLine();
		System.out.print("이름 입력 >> ");
		String name = scn.nextLine();
		System.out.print("나이 입력 >> ");
		int age = Integer.parseInt(scn.nextLine());
		System.out.print("성별 입력 >> ");
		String gen = scn.nextLine();
		System.out.print("전화번호 입력 >> ");
		String tel = scn.nextLine();
		System.out.print("주소 입력 >> ");
		String adrs = scn.nextLine();
		member.setMemberId(id);
		member.setMemberPassword(pw);
		member.setMemberName(name);
		member.setMemberAge(age);
		member.setMemberGender(gen);
		member.setMemberTel(tel);
		member.setMemberAddress(adrs);
		if (ms.memberSignUp(member) != 0) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("실패");
		}
	}

	private void memberDelete() {
		MemberVO member = new MemberVO();
		System.out.println("=== 회원 탈퇴 ===");
		System.out.print("탈퇴할 회원 ID를 입력 >> ");
		int id = Integer.parseInt(scn.nextLine());
		System.out.print("입력한 ID의 비밀번호 입력 >> ");
		String pw = scn.nextLine();
		member.setMemberId(id);
		member.setMemberPassword(pw);
		if (ms.memberDelete(member) != 0) {
			System.out.println("탈퇴완료");
		} else {
			System.out.println("아이디 및 비밀번호가 맞지 않습니다.");
		}
	}

	private void memberMenu() {
		boolean r = false;
		boolean end = true;
		do {
			memberTitle();
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				if (memberLogin()) {
					r = true;
					w = false;
				} else {
					System.out.println("아이디 및 비밀번호가 맞지 않습니다.");
				}
				break;
			case 2:
				memberSignUp();
				break;
			case 3:
				memberDelete();
				break;
			case 4:
				System.out.println("종료합니다..");
				System.exit(menu);
				break;
			}
		} while (!end);
	}

	public void run() {
		boolean b = true;
		do {
			while (w) {
				memberMenu();
			}
			boardTitle();
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				boardInsert();
				break;
			case 2:
				boardUpdate();
				break;
			case 3:
				boardDelete();
				break;
			case 4:
				boardSelect();
				break;
			case 5:
				boardSelectList();
				break;
			case 6:
				System.out.println("종료합니다..");
				b = false;
				break;
			}
		} while (b);
		scn.close();
	}

	private void boardTitle() { // 게시판 메뉴
		System.out.println("=== 게시판 ===");
		System.out.println(" 1.글등록 ");
		System.out.println(" 2.글수정 ");
		System.out.println(" 3.글삭제 ");
		System.out.println(" 4.단건조회 ");
		System.out.println(" 5.전체조회 ");
		System.out.println(" 6.종료 ");
		System.out.println("=============");
		System.out.print("메뉴를 선택하세요 >> ");
	}

	private void boardInsert() { // 글 등록
		BoardVO board = new BoardVO();
		System.out.print("글번호 입력>>");
		int id = Integer.parseInt(scn.nextLine());
		System.out.print("작성자 입력>>");
		String writer = scn.nextLine();
		System.out.print("제목 입력>>");
		String title = scn.nextLine();
		System.out.print("내용 입력>>");
		String subject = scn.nextLine();
		board.setBoardId(id);
		board.setBoardWriter(writer);
		board.setBoardTitle(title);
		board.setBoardSubject(subject);
		if (bs.boardInsert(board) == 1) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록실패");
		}
	}

	private void boardUpdate() { // 글 수정
		BoardVO board = new BoardVO();
		System.out.print("수정할 글번호 입력>>");
		int num = Integer.parseInt(scn.nextLine());
		System.out.print("수정할 내용 입력>>");
		String content = scn.nextLine();
		board.setBoardId(num);
		board.setBoardSubject(content);
		if (bs.boardUdpdate(board) == 1) {
			System.out.println("수정완료");
		} else {
			System.out.println("존재하지 않는 번호입니다. \n");
		}
	}

	private void boardDelete() { // 글 삭제
		BoardVO board = new BoardVO();
		System.out.print("삭제할 글번호 입력>>");
		int del = Integer.parseInt(scn.nextLine());
		board.setBoardId(del);
		if (bs.boardDelete(board) == 1) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("존재하지 않는 번호입니다. \n");
		}
	}

	private void boardSelect() { // 목록 출력
		BoardVO board = new BoardVO();
		System.out.print("출력할 글번호를 적어주세요>>");
		int id = Integer.parseInt(scn.nextLine());
		board.setBoardId(id);
		if (bs.boardSelect(board).getBoardSubject() != null) {
			bs.hitCount(board);
			System.out.println("번호\t작성자\t제목\t내용\t등록날짜  \t조회수");
			board.toString();
		} else {
			System.out.println("존재하지 않는 번호입니다. \n");
		}
	}

	private void boardSelectList() { // 전체목록 출력
		System.out.println("번호\t작성자\t제목\t내용\t등록날짜  \t조회수");
		List<BoardVO> bv = bs.boardSelectList();
		if (!bv.isEmpty()) {
			for (BoardVO board : bv) {
				board.toString();
			}
		} else {
			System.out.println("존재하지 않는 번호입니다. \n");
		}
	}
}