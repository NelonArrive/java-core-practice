package dev.nelon.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("A"); // дубликат
		
		System.out.println("LinkedHashSet (order preserved):");
		for (String value : set) {
			System.out.println(value);
		}
		
		set.remove("A");
		System.out.println("After remove A: " + set);
	}
}

//📌 Фишка:
// порядок вставки сохраняется
// скорость почти как HashSet
// памяти жрёт больше