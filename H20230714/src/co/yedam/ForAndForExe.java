package co.yedam;

public class ForAndForExe {

	public static void main(String[] args) {
		practice3();
		practice4();
	}

	public static void practice3() {

		while (true) {
			int num1 = (int) (Math.random() * 5) + 1;
			System.out.println(num1);
			int num2 = (int) (Math.random() * 5) + 1;
			System.out.println(num2);
			if (num1 + num2 == 5) {
				System.out.printf("%d , %d \n", num1, num2);
				break;
			}

		}
	}

	public static void practice4() {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.printf("x => %d, y => %d \n", x, y);
				}
			}
		}

	}

}// end main ()
//	
//	public static void forAndfor() {
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 4; j <= 6; j++) {
//								System.out.printf("%d * %d = %2d", j, i, (j * i));
//				}
//				System.out.println();
//			}
//			
//	}

// end class ~