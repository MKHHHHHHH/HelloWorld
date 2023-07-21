package collet;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		stack.push("홍");
		stack.push("김");
		stack.push("박");

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}
}
