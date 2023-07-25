package a;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class User {
	Scanner scn = new Scanner(System.in);
	Map<String, String> users = new Hashtable<>();

	User() {
		users.put("홍길동", "1234");
		users.put("김길동", "2345");
		users.put("박길동", "3456");
	}

	boolean login(String id, String pw) {

		if (users.containsKey(id)) {
			if (users.get(id).equals(pw)) {
				System.out.println("--- 로그인 완료 ---");
				return false;
			}
		}
		return true;
	}
}
