package collet;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExe {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		que.offer("홍길동");
		que.offer("킴길동");
		que.offer("팍길동");
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}
