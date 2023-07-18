package co.yedam.student;

public class StudentAppExe {
	public static void main(String[] args) {

		java.util.Scanner scn = new java.util.Scanner(System.in); // 입력 생성
		StudentApp app = new StudentApp(); // 스튜던트앱의 인스턴트 생성

		// 메뉴: 1.등록 2.목록 3.합계 4.최고점 5.종료.
		// 기능 구현.
		boolean run = true;

		while (run) {

			System.out.println("메뉴: 1.등록 2.목록 3.합게 4.최고점 5.종료");
			System.out.println("선택하세요 >> ");

			int select = Integer.parseInt(scn.nextLine());

			if (select == 1) {
				System.out.println("학생번호를 등록해주세요 >>");
				String no = scn.nextLine();
				System.out.println("학생이름을 등록해주세요 >>");
				String name = scn.nextLine();
				System.out.println("학생점수를 등록해주세요 >>");
				int score = Integer.parseInt(scn.nextLine());
				System.out.println("학생키를 등록해주세요 >>");
				double hei = Double.parseDouble(scn.nextLine());

				Student std = new Student(no, name, score, hei);
				if (app.addStudent(std)) {
					System.out.println("정상적으로 등록됨");
				} else {
					System.out.println("등록이 안되었습니다.");
				}
			} else if (select == 2) {
				Student[] ary = app.studentList();
				for (int i = 0; i < ary.length; i++) {
					if (ary[i] != null) {
						System.out.printf("학생번호 %s, 이름 %s, 점수 %d \n", ary[i].stdNo, ary[i].stdName, ary[i].score);
					}
				}
			} else if (select == 3) {
				int sum = app.sumScores();
				System.out.println("합계점수는 " + sum);
			} else if (select == 4) {
				int max = app.maxPrint();
				System.out.println("최고점수는 " + max);
			} else if (select == 5) {
				run = false;
			}

		}
		System.out.println("end"); // WHILE문 끝
	}
}
