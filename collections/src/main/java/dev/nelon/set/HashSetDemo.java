package dev.nelon.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("A"); // дубликат — не добавится
		set.add(null); // HashSet разрешает null
		set.add(null); // второй null не добавится
		
		System.out.println("HashSet:");
		for (String value : set) {
			System.out.println(value);
		}
		
		System.out.println("Contains A: " + set.contains("A"));
		set.remove("B");
		System.out.println("After remove B: " + set);
	}
}
