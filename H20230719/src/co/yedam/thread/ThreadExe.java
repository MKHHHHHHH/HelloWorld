package co.yedam.thread;

import java.awt.Toolkit;

import co.yedam.thread.PrintThread.BeepTask;

class PrintThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	class BeepTask implements Runnable {
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				System.out.println("print");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}
	}
}

public class ThreadExe {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());

		PrintThread thread = new PrintThread();
		thread.start();

		Thread bthread = new Thread(new Runnable() {
			;
			public void run() {
			};
		});

		System.out.println("END OF PROG.");
	}
}
