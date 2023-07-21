package co.yedam.friend;

import java.util.Scanner;

public class Mainexe {
	public static void main(String[] args) {

		// 1.등록 2.목록 3.수정 4.삭제 5.단건조회 6.종료
		Scanner scn = new Scanner(System.in);
		AddressApp app = new AddressApp();
		boolean run = true;
		int select;

		while (run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.단건조회 6.종료");
			System.out.println("선택하세요>>");
			try {
				select = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요>>");
				continue;
			}

			try {
				// 1 ~ 6 메뉴 이외의 메뉴 선택하면...
				if (select < 1 || select > 6) {
					throw new SelectException(select); // 예외발생.
				}
			} catch (SelectException e) {
				e.showMessage();
				continue;
			}

			if (select == INIT_MENU.ADD) {
				System.out.println("등록창");
				System.out.println("1.친구 2.회사 3.학교");
				System.out.println("선택하세요>>");
				int selecttwo = Integer.parseInt(scn.nextLine());

				if (selecttwo == 1) {
					System.out.println("이름을 입력하세요>>");
					String name = scn.nextLine();
					System.out.println("핸드폰번호를 입력하세요>>");
					String phone = scn.nextLine();

					if (app.addFriend(new Friend(name, phone))) {
						System.out.println("등록완료");
					} else {
						System.out.println("등록불가");
					}

				}
				if (selecttwo == 2) {
					System.out.println("회사를 입력하세요>>");
					String company = scn.nextLine();
					System.out.println("부서를 입력하세요>>");
					String dept = scn.nextLine();

					if (app.addFriend(new Friend(company, dept))) {
						System.out.println("등록완료");
					} else {
						System.out.println("등록불가");
					}

				}
				if (selecttwo == 3) {
					System.out.println("학교명을 입력하세요>>");
					String school = scn.nextLine();
					System.out.println("전공을 입력하세요>>");
					String major = scn.nextLine();

					if (app.addFriend(new Friend(school, major))) {
						System.out.println("등록완료");
					} else {
						System.out.println("등록불가");
					}
				}
			}
			if (select == INIT_MENU.LIST) {
				System.out.println("조회할 이름을 입력하세요>>");
				String name = scn.nextLine();

//				if (app.findFriend(new Friend(name)));

			}
			if (select == INIT_MENU.EDIT) {
				System.out.println("이름을 입력해주세요>>");
				String name = scn.nextLine();
				System.out.println("수정할 번호를 입력해주세요>>");
				String phone = scn.nextLine();
				if (app.editFriend(new Friend(name, phone))) {
					System.out.println("수정완료");
				} else {
					System.out.println("수정불가");
				}

			}
			if (select == INIT_MENU.DEL) {

			}
			if (select == INIT_MENU.SEARCH) {

			}
			if (select == INIT_MENU.EXIT) {
				System.out.println("종료");
				run = false;
			}

		}
		System.out.println("END OF PROG");
	}
}
// Friend <- Company, School
//Friend[] friends = new Friend[10];
//
//// friends배열에 friend 클래스의 인스턴스 대입
//friends[0] = new Friend("홍길동", "010-1111");
//friends[1] = new Company("김길동", "010-2222", "네이버", "개발부서");
//friends[2] = new School("김길동", "010-2222", "대구대학교", "개발");
//// friend 자식들 넣기 가능~
//
//for (int i = 0; i < friends.length; i++) {
//	if (friends[i] != null) {
//		System.out.println(friends[i].showInfo()); // 메소드재정의에 의한 showInfo실행.
//	}
//}

//boolean result = app.addFriend(null);
//if(result) {
