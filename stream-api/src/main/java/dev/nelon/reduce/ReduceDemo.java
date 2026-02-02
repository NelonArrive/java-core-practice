package dev.nelon.reduce;

import java.util.List;

public class ReduceDemo {
	public static void main(String[] args) {
		int sum = List.of(1, 2, 3, 4)
			.stream()
			.reduce(0, Integer::sum);
		
		
		System.out.println(sum);
	}
}