package co.yedam.friend;
// 친구의 연락처 관리 app.
// 일반적인 정보 : 이름, 연락처. // Friend 클래스에서 가져오기
// 회사의 정보(회사, 부서), 학교의 정보(학교, 전공),

public class AddressApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[5];
		
		friends[0] = new Friend ("ㅎㅇ", "ㅎㅎ");
		friends[1] = new Company ("aa", "gg", "qq", "ww");
		friends[2] = new School ("aa", "bb", "bbb", "xcvcxbv");
		
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null) {
				System.out.println(friends[i].showInfo());
			}
		}

		
	}
}
