package dev.nelon.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// add в конец (O(1) амортизированно)
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		System.out.println(list); // [0, 1, 2, 3, 4]
		
		// add в середину (O(n))
		list.add(2, 99);
		System.out.println(list); // [0, 1, 99, 2, 3, 4]
		
		// remove по индексу (O(n))
		list.remove(3);
		System.out.println(list); // [0, 1, 99, 3, 4]
		
		// быстрый доступ по индексу
		System.out.println(list.get(0)); // 0
	}
}
