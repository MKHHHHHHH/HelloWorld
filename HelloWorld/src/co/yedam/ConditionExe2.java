package co.yedam;

import java.util.Scanner;

public class ConditionExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("메뉴를 선택하세요: (숫자를 입력)>>");
			String menu = scn.nextLine();
			
			// switch, if else if else
					
		switch(menu) {
		case "1" : 
			login();
			break;
		case "2" : 
			logout();
			break;
		case "3" :
			signup();
			break;
		default :
			run = false;
			
						}
	}
		
		
	} // end of main();
	
//	boolean run = true;
	//try {
//		switch (menu) {
//		case "1":
//			login();
//			break;
//		case "2":
//			logout();
//		case "3":
//			singup();
//		default:
		//throw new IOExcaption(); // 예외발생
//		run = false;
//		}
//	} catch (IOException e){
//		e.printStackTrace();
//		break;
//}
//	
	
	
//	public static void menuChoice() {
//		Scanner scn = new Scanner(System.in);
//		while(true) {
//			System.out.println("메뉴를 선택하세요: (숫자를 입력)>>");
//			String menu = scn.nextLine();
//			
//			// switch, if else if else
//					
//		if(menu.equals(1)) {
//			login();
//		} else if(menu.equals(2)) {
//			logout();
//		} else if(menu.equals(3)) {
//			signup();
//		} else {
//			break;
//		}
//	}
//		System.out.println("END");
//		scn.close();
//	
//	} // end of main();
	
	
	
	
	
	public static void login() {
		System.out.println("로그인 메뉴입니다.");
	}
	public static void logout() {
		System.out.println("로그아웃 메뉴입니다.");
	}
	public static void signup() {
		System.out.println("회원가입 메뉴입니다.");
	}
	
	
}
	
	

