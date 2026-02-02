package dev.nelon.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// put
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		// replace value
		map.put("A", 100);
		
		// get
		System.out.println(map.get("A")); // 100
		
		// contains
		System.out.println(map.containsKey("B")); // true
		System.out.println(map.containsValue(3)); // true (O(n))
		
		// iteration
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		// remove
		map.remove("B");
		
		System.out.println(map);
	}
}

// 📌 Важно
// порядок НЕ гарантирован
// O(1) в среднем
// допускает null ключ и значения