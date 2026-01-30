package dev.nelon.set;

import java.util.TreeSet;

public class TreeSetDemo {
	
	static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(10);
		set.add(5);
		set.add(20);
		set.add(1);
		set.add(5); // дубликат
		
		System.out.println("TreeSet (sorted):");
		for (Integer value : set) {
			System.out.println(value);
		}
		
		System.out.println("First: " + set.first());
		System.out.println("Last: " + set.last());
	}
}

//📌 Важно:
// автоматическая сортировка
// O(log n)
// null → ❌ NullPointerException