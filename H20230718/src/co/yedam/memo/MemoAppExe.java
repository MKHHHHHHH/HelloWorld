package co.yedam.memo;

import java.util.Scanner;

public class MemoAppExe {
	public static void main(String[] args) {

		MemoApp memoApp = new MemoApp();
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1:등록 2:수정 3:삭제 4:목록 5:조회");
			System.out.println("선택하세요>> ");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				System.out.println("계좌번호를 입력하세요>> ");
				int bbun = Integer.parseInt(scn.nextLine());
				System.out.println("예금주를 입력하세요>> ");
				String hu = scn.nextLine();
				System.out.println("입금액을 입력하세요>> ");
				String money = scn.nextLine();
				
				Memo memo = new Memo(bbun, hu, money);
			}
			else if (menu == 2) {
				
			}
		}
	}
}
