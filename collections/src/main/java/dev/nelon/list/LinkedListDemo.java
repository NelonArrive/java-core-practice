package dev.nelon.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list); // [A, B, C]
		
		// вставка по индексу (O(n))
		list.add(1, "X");
		System.out.println(list); // [A, X, B, C]
		
		// удаление по индексу (O(n))
		list.remove(2);
		System.out.println(list); // [A, X, C]
		
		// get — тоже O(n)
		System.out.println(list.get(1)); // X
	}
}

//📌 Важно
// LinkedList НЕ быстрее для вставки по индексу
// он выигрывает только если работаешь через итератор