package dev.nelon.collect;

import dev.nelon.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDemo {
	public static void main(String[] args) {
		List<Person> people = List.of(
			new Person("Alex", "Berlin", 17),
			new Person("Bob", "Paris", 22)
		);
		
		Map<Boolean, List<Person>> adults =
			people.stream()
				.collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
		
		System.out.println(adults);
	}
}
