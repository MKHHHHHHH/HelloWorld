package co.yedam.inherit;

public class PhoneExe {
	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		cellphone.setModel("Galaxy S10");
		cellphone.setColor("White");
		cellphone.powerOn();
		cellphone.sendMessage();
		cellphone.powerOff();
		System.out.println(cellphone.showInfo());
		System.out.println("-------------------------");
		// 자식 클래스는 부모클래스의 필드, 메소드, 생성자.
		DmbCellPhone dmbphone = new DmbCellPhone();
		dmbphone.setModel("Galaxy Dmb 1");
		dmbphone.setColor("Yellow");
		dmbphone.powerOn();
		dmbphone.sendMessage();
		dmbphone.turnOn();
		dmbphone.changeChannel(10);
		dmbphone.turnOff();
		dmbphone.powerOff();
		System.out.println(dmbphone.showInfo());

		// 부모클래스의 변수에 자식클래스의 변수 대입.
		Cellphone parent = new DmbCellPhone("DMB S22", "White", 10); // promotion
		// parent.turnOn(); // 자식클래스의 필드, 메소드 사용이 불가.
		System.out.println(parent.showInfo());
		DmbCellPhone child = null;

		if (parent instanceof DmbCellPhone) {
			child = (DmbCellPhone) parent; // casting
			child.turnOn();
		}

		// 부모클래스의 변수를 자식변수로 casting 할 경우 체크.
		if (cellphone instanceof DmbCellPhone) {
			child = (DmbCellPhone) cellphone;
			child.turnOn();
		}
	}
}
