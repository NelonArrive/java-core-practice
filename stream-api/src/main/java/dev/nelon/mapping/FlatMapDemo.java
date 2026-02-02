package dev.nelon.mapping;

import java.util.List;

public class FlatMapDemo {
	static void main(String[] args) {
		List<List<String>> data = List.of(
			List.of("A", "B"),
			List.of("C", "D")
		);
		
		data.stream()
			.flatMap(List::stream)
			.forEach(System.out::println);
	}
}
