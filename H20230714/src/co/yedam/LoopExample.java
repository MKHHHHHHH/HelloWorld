package co.yedam;

public class LoopExample {
	public static void main(String[] args) {
		// 76800원 > 5만원: 1장, 만원: 2장, 5천원: 1장, 천원: 1장, 500원: 1, 100원: 3
		int value = ((int) (Math.random () * 50000 / 100)) * 100 + 50000;
		System.out.println(value);
		int div = 50000;
		int a = 0;
		int b = 0;
		String result = value + "원 ";
		
		
		a = value / div;
		b = value - (a * div);
		result += div + "원 " + a + "장 ";
		value = b;
		
		div = 10000;
		a = value / div;
		b = value - (a * div);
		result += div + "원 " + a + "장 ";
		value = b;
		
		div = 5000;
		a = value / div;
		b = value - (a * div);
		result += div + "원 " + a + "장 ";
		value = b;
		
		div = 1000;
		a = value / div;
		b = value - (a * div);
		result += div + "원 " + a + "장 ";
		value = b;
		
		div = 500;
		a = value / div;
		b = value - (a * div);
		result += div + "원 " + a + "장 ";
		value = b;
		
		div = 100;
		a = value / div;
		b = value - (a * div);
		result += div + "원 " + a + "장 ";
		value = b;
		
		
		
		System.out.println(result);
		
		
		
	} // END MAIN
} // END CLASS
