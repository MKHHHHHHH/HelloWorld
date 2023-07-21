package co.yedam.interfaces;

// RemoteCon 인터페이스 구현하는 클래스
public class Audio implements RemoteCon{
	double freq;
	
	public Audio() {
		
	}
	
	public void setFreq(double freq) {
		this.freq = freq;
	}

	@Override
	public void turnOn() {
		System.out.println("Audio의 전원 켬");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끔");
		
	}

}
