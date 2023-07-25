package a;

public class Program {
	private int code; // 상품코드
	private String name; // 상품명
	private int price; // 상품가격
	private int cellnum; // 판매수량
	private String cellday; // 판매일
	private int buynum; // 구매수량
	private String buyday; // 구매일

	public Program(int code, String name, int price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public Program(int code, String name, int price, int cellnum, String cellday, int buynum, String buyday,
			String stock) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.cellnum = cellnum;
		this.cellday = cellday;
		this.buynum = buynum;
		this.buyday = buyday;
		this.stock = stock;
	}


	private String stock; // 재고수량

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCellnum() {
		return cellnum;
	}

	public void setCellnum(int cellnum) {
		this.cellnum = cellnum;
	}

	public String getCellday() {
		return cellday;
	}

	public void setCellday(String cellday) {
		this.cellday = cellday;
	}

	public int getBuynum() {
		return buynum;
	}

	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}

	public String getBuyday() {
		return buyday;
	}

	public void setBuyday(String buyday) {
		this.buyday = buyday;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

}
