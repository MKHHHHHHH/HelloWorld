package co.yedam.Bank;

public class Account {
	// 필드.
	String bunho;
	String human;
	int money;
	
	// 생성자
	Account(String abc, int atm){
		
	}
	
	Account(String bunho) {
		this.bunho = bunho;
	}

	public Account(String bunho, String human, int money) {
		super();
		this.bunho = bunho;
		this.human = human;
		this.money = money;
	}
	
	// 목록기능 출력
	public String showInfo() {
		return "계좌정보: " + bunho + ", 예금주: " + human + ", 잔고: " + money;
	}
}
