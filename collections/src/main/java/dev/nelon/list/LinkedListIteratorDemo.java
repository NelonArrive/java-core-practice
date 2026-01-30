package dev.nelon.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIteratorDemo {
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator<String> iterator = list.listIterator();
		
		iterator.next(); // A
		iterator.add("X"); // O(1)
		
		System.out.println(list); // [A, X, B, C]
	}
}

//📌 Собесный момент
// LinkedList эффективен только если уже есть ссылка на позицию