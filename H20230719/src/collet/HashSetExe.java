package collet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExe {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // 중복값 x

		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");

		// 확장 for.
		for (String fruit : set) {
			System.out.println(fruit);
		}

		set.remove("Apple");
		set.clear();

		if (set.isEmpty()) {
			System.out.println("set 비어있음.");
		}

		// 크기.
		System.out.println("set 크기: " + set.size());

		Set<Integer> lotto = new HashSet<>();
		// 1~ 10 임의의 번호를 lotto에 저장.

		while (lotto.size() < 6) {
			int temp = (int) (Math.random() * 45) + 1;
			lotto.add(temp);
		}
		System.out.println(lotto);
	}
}