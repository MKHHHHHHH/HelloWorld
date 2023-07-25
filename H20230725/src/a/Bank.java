package a;

public class Bank {
	private String num;
	private String name;
	private String pw;
	private String balance;

	@Override
	public String toString() {
		return "번호 = " + num + ", 이름 = " + name + ", balance = " + balance;
	}

	public Bank(String num, String name, String pw) {
		super();
		this.num = num;
		this.name = name;
		this.pw = pw;

	}

	public Bank(String num, String name, String pw, String balance) {
		super();
		this.num = num;
		this.name = name;
		this.pw = pw;
		this.balance = balance;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

}
