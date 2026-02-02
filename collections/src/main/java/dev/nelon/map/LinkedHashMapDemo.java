package dev.nelon.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		// insertion order
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("C", 3);
		map.put("A", 1);
		map.put("B", 2);
		
		System.out.println(map); // C, A, B
		
		// access order (LRU-style)
		Map<String, Integer> accessMap =
			new LinkedHashMap<>(16, 0.75f, true);
		
		accessMap.put("A", 1);
		accessMap.put("B", 2);
		accessMap.put("C", 3);
		
		accessMap.get("A"); // moves A to the end
		
		System.out.println(accessMap); // B, C, A
	}
}

//📌 Используют для LRU cache 🔥
//📌 Чуть больше памяти, чем HashMap