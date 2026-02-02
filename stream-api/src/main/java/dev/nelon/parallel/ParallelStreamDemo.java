package dev.nelon.parallel;

import java.util.List;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		List.of(1,2,3,4,5,6)
			.parallelStream()
			.forEach(System.out::println);
	}
}