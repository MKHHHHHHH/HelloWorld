package co.yedam.interfaces;

class RunClass implements Runnable {

	public void run() {
		System.out.println("runcalss 실행");

	}

}

public class RunExe {
	public static void main(String[] args) {
		RunClass run = new RunClass();
		run.run();

		// 익명구현객체
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명");
			}
		};
		runnable.run();
		
		// 람다 표현식
		runnable = () -> System.out.println("익명2");
		runnable.run();
	}
}
