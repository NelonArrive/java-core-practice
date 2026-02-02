package dev.nelon.comparable;

import dev.nelon.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("Alex", 30));
		users.add(new User("Bob", 20));
		users.add(new User("Charlie", 25));
		
		Collections.sort(users);
		
		System.out.println("Sorted by age (Comparable): ");
		users.forEach(System.out::println);
	}
}
