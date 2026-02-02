package dev.nelon.collect;

import dev.nelon.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CountingDemo {
	public static void main(String[] args) {
		List<Person> people = List.of(
			new Person("Alex", "Berlin", 25),
			new Person("Bob", "Berlin", 30)
		);
		
		
		Map<String, Long> countByCity =
			people.stream()
				.collect(Collectors.groupingBy(
					Person::getCity,
					Collectors.counting()
				));
		
		
		System.out.println(countByCity);
	}
}