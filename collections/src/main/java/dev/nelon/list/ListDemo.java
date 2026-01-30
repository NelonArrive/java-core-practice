package dev.nelon.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list); // [A, B, C]
		
		list.add(1, "X"); // вставка в середину
		System.out.println(list); // [A, X, B, C]
		
		list.remove("B");
		System.out.println(list); // [A, X, C]
		
		System.out.println(list.get(1)); // X
	}
}
