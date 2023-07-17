package co.yedam.member;

import javax.sql.rowset.serial.SQLOutputImpl;

public class MemberExe {
	public static void main(String[] args) {

		java.util.Scanner scn = new java.util.Scanner(System.in);
		boolean run = true;
		Member[] members = new Member[10];
		Member m1 = new Member();
		m1.setMemberNo(1001);
		m1.setMemberName("홍길동");
		m1.setPhone("010-1111");
		m1.setGender(Gender.MEN);
		m1.setAddress("대구100");

		Member m2 = new Member();
		m2.setMemberNo(1002);
		m2.setMemberName("김길동");
		m2.setPhone("010-2222");
		m2.setGender(Gender.WOMEN);
		m2.setAddress("대구200");
		members[0] = m1;
		members[1] = m2;

		Member m3 = new Member();
		members[2] = m3;

		Member m4 = new Member(3001, "홍미숙", "010-1234", Gender.WOMEN, "대구 123");
		members[3] = m4;

		while (run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.상세조회 6.남자회원목록 7.종료");
			System.out.println("선택하세요>> ");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				System.out.println("등록기능");
				System.out.println("회원번호 입력 >>");
				int mNo = Integer.parseInt(scn.nextLine());
				System.out.println("회원이름입력 >>");
				String mName = scn.nextLine();
				System.out.println("회원연락처입력 >>");
				String phone = scn.nextLine();
				System.out.println("회원성별입력 >>");

				// 남, 남자 startsWith
				Gender gender = null;
				String temp = scn.nextLine();
				if (scn.nextLine().startsWith("남")) {
					gender = Gender.MEN;
				} else if (temp.startsWith("여")) {
					gender = Gender.WOMEN;
				}

				System.out.println("회원주소입력 >>");
				String addr = scn.nextLine();

				Member member = new Member(); // 인스턴스
				member.setMemberNo(mNo);
				member.setMemberName(mName);
				member.setPhone(phone);
				member.setGender(gender);
				member.setAddress(addr);

				// members 멤버인스턴스 10개 저장.
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = member; // 배열의 빈값에 저장
						break; // 한건 저장후 그만!
					}
				}

			} else if (menu == 2) {
				System.out.println("목록기능");
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null) {
						System.out.printf(members[i].showInfo());
						System.out.println("\n");
					}
				}

			} else if (menu == 3) {
				System.out.println("기존번호 입력 >> ");
				Member membar = new Member();
				String phone = null;
				membar.setPhone(phone);
				int num1 = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null && members[i].getMemberNo() == num1) {
						System.out.println("변경할 번호 입력");
						phone = scn.nextLine();
						membar.setPhone(phone);
						break;

					}
				}

			} else if (menu == 4) {
				System.out.println("삭제기능");
				System.out.println("회원정보입력 >>");
				int no = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null && members[i].getMemberNo() == no) {
						members[i] = null;
						break;

					}
				}
			} else if (menu == 5) {
				System.out.println("상세보기기능");
				System.out.println("회원정보입력 >>");
				int no = Integer.parseInt(scn.nextLine());
				boolean wow = false;
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null && members[i].getMemberNo() == no) {
						System.out.println(members[i].detailInfo());
						wow = true;
					}
					if (wow == false) {
						System.out.println("입력한 값과 맞지 않습니다.");
						break;

					}

				}

			} else if (menu == 6) {
				Member menber = new Member();
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null && members[i].getGender() == Gender.MEN) {
						System.out.println(members[i].showInfo());
					}
				}
			} else if (menu == 7) {
				System.out.println("종료");
				run = false;
			}
		}
		System.out.println("end of prog.");

	} // MAINNNNNNNNNNNNNN
} // END CLASS
