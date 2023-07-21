package collet;

import java.util.ArrayList;
import java.util.List;

import co.yedam.friend.Friend;

public class ArrayListExe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("박길동");
		for (int i = 0; i < 15; i++) {
			list.add(String.valueOf(i));
		}
		List<Integer> inti = new ArrayList<Integer>();
		inti.add(10);
//		list.add(new Friend("김길동", "010-1111"));
		
		String obj = list.get(0);
		list.set(0, "Hong");
		System.out.println("크기: " + list.size());
		list.remove(0); // list[0]
		obj = list.get(0);
		
		list.clear();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("[%d]의 위치값 %s \n", i, list.get(i));
		}
		
		Integer num = inti.get(0);
		System.out.println(obj + "," + num);
		System.out.println("크기: " + list.size());
	}
}
