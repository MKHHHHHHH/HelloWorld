package co.yedam.memo;

public class Memo {
	int number;
	String neyo;
	String date;
	
	Memo() {
		
	}
	
	Memo (int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNeyo() {
		return neyo;
	}

	public void setNeyo(String neyo) {
		this.neyo = neyo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Memo(int number, String neyo, String date) {
		super();
		this.number = number;
		this.neyo = neyo;
		this.date = date;
	}
	
	public String memoList() {
		return "번호: " + number + "내용: " + neyo + "날짜: " + date;
	}
	
	
}
