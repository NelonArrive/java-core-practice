package dev.nelon.comparator;

import dev.nelon.model.User;

import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {
	static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("Alex", 30));
		users.add(new User("Bob", 20));
		users.add(new User("Charlie", 25));
		
		users.sort(new ComparatorByName());
		System.out.println("Sorted by name (Comparator):");
		users.forEach(System.out::println);
		
		System.out.println();
		
		users.sort(new ComparatorByAge());
		System.out.println("Sorted by age (Comparator):");
		users.forEach(System.out::println);
	}
}
