package co.yedam.interfaces;

public class MainExe {
	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		
		Television television = new Television();
		television.turnOn();
		television.turnOff();
		
		// 인터페이스.
		RemoteCon rc = audio;
		rc = television;
		rc.turnOn();
		rc.turnOff();
	}
}
