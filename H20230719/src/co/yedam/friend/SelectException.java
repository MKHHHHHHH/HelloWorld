package co.yedam.friend;

public class SelectException extends Exception {
	int choice;
	
	public SelectException(int choice) {
		this.choice = choice;
	}
	
	public void showMessage() {
		System.out.println(choice + "는 잘못된 메뉴입니다.");
	}
}
