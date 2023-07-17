package co.yedam.student;

public class StudentExe {
	public static void main(String[] args) {
		// 학생번호, 학생이름, 점수.
		Student std1 = new Student(); // 인스턴스. (생성)
		std1.setStudentNo(100);
		std1.setStudentName("홍길동");
		std1.setScore(80);

//		System.out.println(std1.score);

		Student std2 = new Student(); // 인스턴스
		std2.setStudentNo (110);
		std2.setStudentName ("김길동");
		std2.setScore (85);

		Student[] students = { std1, std2 }; // 배열선언
		students = new Student[5];
		students[0] = std1;
		students[1] = std2;

		// 120 박길동 90 => std3

		Student std3 = new Student();
		std3.setStudentNo (120);
		std3.setStudentName ("박길동");
		std3.setScore (90);

		students[2] = std3;
		
		String searchName = "홍길동";
		
		// 최고점수를 받은 학생의 정보 출력.
		int max = 0;
		// 평균 점수
		int sum = 0;
		double avg = 0;
		// max값을 학생의 정보를 담기위한 Student.
		Student maxStd= new Student();
		
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null) {
			sum += students[i].getScore();
			avg = sum / 3;
			}
		}
		System.out.printf("합계점수: %d, 평균: %f", sum, avg);
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if(students[i].getScore() > max) {
				  	max = students[i].getScore();
				  	maxStd = students[i];
				}
			}
		}
		System.out.printf("학생번호 : %d, 이름: %s, 점수 %d", maxStd.getStudentNo(), maxStd.getStudentName(), maxStd.getScore());

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				// 4,5 번째 null값이 아닌것들만
				if(students[i].getStudentName().equals(searchName)) {
				System.out.printf("학생번호 : %d, 이름: %s, 점수 %d", students[i].getStudentNo(), students[i].getStudentName(), students[i].getScore());
				}
			}
		}

	} // MAINNNNNNN
} // ENDDDDDDD
