package co.yedam.Exceptions;

import java.util.Scanner;

public class ExceptionExe2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("이름>> ");
		String name = scn.nextLine();

		System.out.println("나이>> ");
		boolean run = true;
		int age = 0;

		while (run) {
			try {
				age = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요>> ");
				continue;
			}
				run = false;
		}

		System.out.println("주소>> ");
		String addr = scn.nextLine();

		System.out.printf("이름은: %s, 나이는: %d 주소는: %s", //
				name, age, addr);

	}
}
