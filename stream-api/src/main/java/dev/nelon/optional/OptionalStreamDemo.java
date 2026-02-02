package dev.nelon.optional;

import java.util.List;

public class OptionalStreamDemo {
	public static void main(String[] args) {
		List.of(1, 3, 5, 8)
			.stream()
			.filter(n -> n % 2 == 0)
			.findFirst()
			.ifPresent(System.out::println);
	}
}