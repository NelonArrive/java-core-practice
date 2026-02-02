package dev.nelon.collect;

import java.util.List;
import java.util.stream.Collectors;

public class CollectToListDemo {
	public static void main(String[] args) {
		List<Integer> result = List.of(1, 2, 3)
			.stream()
			.collect(Collectors.toList());
		
		System.out.println(result);
	}
}