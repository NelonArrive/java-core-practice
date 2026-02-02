package dev.nelon.debug;

import java.util.List;

public class PeekDemo {
	public static void main(String[] args) {
		List.of(1, 2, 3)
			.stream()
			.peek(n -> System.out.println("before: " + n))
			.map(n -> n * 2)
			.peek(n -> System.out.println("after: " + n))
			.toList();
	}
}