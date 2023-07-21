package co.yedam.interfaces;

// 인터페이스
// 생성자(X), 필드(O) : 상수(변하지않는 값)로 사용, 메소드 : 추상메소드로 선언.
public interface RemoteCon {
	final int CHANNEL = 10;
	
	abstract void turnOn();
	void turnOff();
}
