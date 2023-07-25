package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramManager {
	List<Program> program = new ArrayList<>();
	Scanner scn = new Scanner(System.in);

	private int getCode() { // 메소드
		int code = 0;
		for (int i = 0; i < program.size(); i++) {
			if (program.get(i).getCode() > code) {
				code = program.get(i).getCode();
			}
		}
		return code + 1;
	}

	public void printMenu() {
		System.out.println("[---제품관리 프로그램---]");
		System.out.println("1.상품등록 2.판매관리 3.구매관리 4.현재재고 \n");
		System.out.print("선택하세요>>");
	}

	public void productAdd() {
		System.out.println("[---상품등록 ---]");
		System.out.print("코드>> ");
		int code = Integer.parseInt(scn.nextLine());
		System.out.print("상품명>> ");
		String name = scn.nextLine();
		System.out.print("상품가격>> ");
		int price = Integer.parseInt(scn.nextLine());

		if (program.add(new Program(code, name, price))) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록실패");
		}

	}
	
	public void cellManager() {
		
	}
}
