package dev.nelon.map;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A"); // ignored
		
		System.out.println(set);
		
		System.out.println(set.contains("B")); // true
		
		set.remove("C");
		
		for (String value : set) {
			System.out.println(value);
		}
	}
}

// 📌 Под капотом:
// HashSet = HashMap<E, Object>
// 📌 Значение всегда один и тот же PRESENT