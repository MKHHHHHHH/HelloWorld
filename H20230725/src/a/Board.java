package a;

public class Board {
	private int bnum;
	private String title;
	private String content;
	private String writer;

	@Override
	public String toString() {
		return "글번호 : " + bnum + " 글제목 : " + title + " 글내용 : " + content + " 작성자 : " + writer;
	}

	public Board(int bnum, String title, String content, String writer) {
		super();
		this.bnum = bnum;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}
