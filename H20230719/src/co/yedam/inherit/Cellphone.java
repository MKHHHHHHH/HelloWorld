package co.yedam.inherit;

public class Cellphone { // 파이날 = 자식 안둠
	
	//필드 (속성)
	private String model;
	private String color;
	
	//기본생성자를 컴파일러가 생성.
	public Cellphone(String model ,String color) {
		this.model = model;
		this.color = color;
	}
	public Cellphone() { // 아무 매개변수가 없는게 기본생성자.
		
	}
	
	
	//메소드 (기능)
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void powerOn() {
		System.out.println("전원 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원 끕니다.");
	}
	public void sendMessage() {
		System.out.println("메세지전송");
	}
	public void receiveMessage() {
		System.out.println("메세지수신");
	}
	public String showInfo() {
		return "모델명: " + model + "색상: " + color;
	}
}
