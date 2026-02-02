package dev.nelon.mapping;

import java.util.List;

public class MapDemo {
	static void main(String[] args) {
		List<String> names = List.of("alex", "bob", "john");
		
		names.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
	}
}
