package co.yedam.friend;

public class Mainexe {
	public static void main(String[] args) {
		// Friend <- Company, School
		Friend[] friends = new Friend[10];

		// friends배열에 friend 클래스의 인스턴스 대입
		friends[0] = new Friend("홍길동", "010-1111");
		friends[1] = new Company("김길동", "010-2222", "네이버", "개발부서");
		friends[2] = new School("김길동", "010-2222", "대구대학교", "개발");
		// friend 자식들 넣기 가능~

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].showInfo()); // 메소드재정의에 의한 showInfo실행.
			}
		}
	}
}
