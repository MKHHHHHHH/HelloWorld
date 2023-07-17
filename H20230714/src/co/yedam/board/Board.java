package co.yedam.board;

public class Board {
	private int bunho;
	private String zemok;
	private String neyo;
	private String human;

	public Board(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public int getBunho() {
		return bunho;
	}

	public void setBunho(int bunho) {
		this.bunho = bunho;
	}

	public String getZemok() {
		return zemok;
	}

	public void setZemok(String zemok) {
		this.zemok = zemok;
	}

	public String getNeyo() {
		return neyo;
	}

	public void setNeyo(String neyo) {
		this.neyo = neyo;
	}

	public String getHuman() {
		return human;
	}

	public void setHuman(String human) {
		this.human = human;
	}
	
	public String showInfo() { // 목록 볼때 쓰기
		return "글번호: " + bunho + ", 글제목: " + zemok + ", 작성자: " + human;
	}
	
	public String wowInfo() { // 상세목록 볼때 쓰기
		return "글번호: " + bunho + ", 글제목: " + zemok + ", 글내용: " + neyo + ", 작성자: " + human;
	
	}
}