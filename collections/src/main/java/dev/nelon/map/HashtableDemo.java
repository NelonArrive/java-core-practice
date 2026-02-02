package dev.nelon.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
	public static void main(String[] args) {
		Map<String, Integer> table = new Hashtable<>();
		
		table.put("A", 1);
		table.put("B", 2);
		
		// table.put(null, 3); // ❌ NullPointerException
		// table.put("C", null); // ❌ NullPointerException
		
		System.out.println(table.get("A"));
		
		// synchronized (но медленно)
		synchronized (table) {
			System.out.println(table);
		}
	}
}

// 📌 “Hashtable — legacy, сейчас используем ConcurrentHashMap”