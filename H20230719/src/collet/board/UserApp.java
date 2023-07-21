package collet.board;

import java.util.Hashtable;
import java.util.Map;

public class UserApp {
	Map<String, String> users = new Hashtable<>();

	UserApp() {
		users.put("user1", "1111");
		users.put("user2", "2222");
		users.put("user3", "3333");

	}

	boolean login(String id, String pw) {
		if (users.containsKey(id)) {
			if (users.get(id).equals(pw)) {
				System.out.println("--- 프로그램을 실행합니다 ---");
				return true;
			}
		}
		return false;
	}
}
