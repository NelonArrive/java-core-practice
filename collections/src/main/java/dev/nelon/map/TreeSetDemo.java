package dev.nelon.map;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(2);
		
		System.out.println(set); // [1, 2, 3, 5]
		
		set.remove(3);
		
		System.out.println(set.contains(5)); // true
	}
}

//📌 Внутри Red-Black Tree
//📌 O(log n)
//📌 всегда отсортирован