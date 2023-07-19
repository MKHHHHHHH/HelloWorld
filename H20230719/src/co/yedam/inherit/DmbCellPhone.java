package co.yedam.inherit;

public class DmbCellPhone extends Cellphone {

	// 추가 속성과 메소드.
	private int channel;

	// 기본생성자 자동생성.
	public DmbCellPhone() {
		super();

	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	// 생성자
	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void turnOn() {
		System.out.println("화면on");
	}

	public void turnOff() {
		System.out.println("화면off");
	}

	public void changeChannel(int channel) {
		this.channel = channel;
	}

	// 부모클래스의 메소드 -> 재정의.
	@Override
	public void powerOn() {
		System.out.println("DMB 폰의 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("DMB 폰의 전원을 끕니다.");
	}

	@Override
	public String showInfo() {
		return "모델: " + getModel() + ", 색상: " + getColor() + ", 채널: " + channel;
	}
}
