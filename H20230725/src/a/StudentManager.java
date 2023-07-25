package a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	List<Student> student = new ArrayList<>();
	Scanner scn = new Scanner(System.in);

	StudentManager() {
		readFromFile();
	}

	public void printMenu() {
		System.out.println("[---성적관리 프로그램---]");
		System.out.println("1.학생정보입력 2.성적입력 3.전체성적출력 4.장학금대상자(A)");
		System.out.print("선택하세요>> ");
	}

	public void studentAdd() {
		System.out.println("[---학생정보입력---]");
		System.out.println("학번");
		int num = Integer.parseInt(scn.nextLine());
		System.out.println("이름");
		String name = scn.nextLine();
		System.out.println("구거");
		int kr = Integer.parseInt(scn.nextLine());
		System.out.println("영어");
		int eng = Integer.parseInt(scn.nextLine());
		System.out.println("수학");
		int math = Integer.parseInt(scn.nextLine());

		if (student.add(new Student(num, name, kr, eng, math))) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록실패");
		}
	}

	public void studentAdd1() {
		System.out.println("[---학생정보입력---]");
		System.out.println("학번");
		int num = Integer.parseInt(scn.nextLine());
		System.out.println("이름");
		String name = scn.nextLine();

		if (student.add(new Student(num, name))) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록실패");
		}
	}

	public void grades() {
		System.out.println("[---성적입력---]");
		System.out.print("국어> ");
		int kr = Integer.parseInt(scn.nextLine());
		System.out.print("영어> ");
		int eng = Integer.parseInt(scn.nextLine());
		System.out.print("수학> ");
		int math = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < student.size(); i++) {
			student.get(i).setKr(kr);
			student.get(i).setEng(eng);
			student.get(i).setMath(math);
		}
	}

	public void grades1() {
		System.out.print("학번 입력>> ");
		int num = Integer.parseInt(scn.nextLine());
		int ox = 0;
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getNum() == num) {
				System.out.println("[---성적입력---]");
				System.out.print("국어> ");
				int kr = Integer.parseInt(scn.nextLine());
				System.out.print("영어> ");
				int eng = Integer.parseInt(scn.nextLine());
				System.out.print("수학> ");
				int math = Integer.parseInt(scn.nextLine());
				student.get(i).setKr(kr);
				student.get(i).setEng(eng);
				student.get(i).setMath(math);
				ox = 1;
			}
		}
		if (ox == 0) {
			System.out.println("없는 학생");
		}
	}

	public void gradeList() {
		System.out.println("[---전체성적출력---]");
		System.out.print("학번을 입력하세요>> ");
		int num = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getNum() == num) {
				System.out.println(student.get(i));
			} else {
				System.out.println("학번이 틀림");
			}
		}
	}

	public void money() {
		System.out.println("[---장학금대상자---]");
		niceMoney();
	}

	public String niceMoney() {
		for (int i = 0; i < student.size(); i++) {
			int kor = student.get(i).getKr();
			int eng = student.get(i).getEng();
			int math = student.get(i).getMath();
			int sum = kor + eng + math;
			double avg = sum / 3;
			if (avg >= 90) {
				System.out.println("이름 :" + student.get(i).getName() + " 학점 : A");
			} else {
				System.out.println("--------------------------------------");
			}

		}
		return null;
	}

	public void storeToFile() {
		// 출력스트림 (객체)
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("c:/Temp/Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			oos.flush();
			oos.close();
			fos.flush();
			fos.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("THE END");
	}

	@SuppressWarnings("unchecked")
	private void readFromFile() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("c:/Temp/Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			student = (List<Student>) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("입력");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
