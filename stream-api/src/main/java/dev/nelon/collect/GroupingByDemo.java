package dev.nelon.collect;

import dev.nelon.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {
	public static void main(String[] args) {
		List<Person> people = List.of(
			new Person("Alex", "Berlin", 25),
			new Person("Bob", "Berlin", 30),
			new Person("John", "Paris", 20)
		);
		
		Map<String, List<Person>> byCity = people.stream()
			.collect(Collectors.groupingBy(Person::getCity));
		
		System.out.println(byCity);
	}
}
