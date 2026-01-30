package dev.nelon.list;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		for (String s : list) {
			System.out.println(s);
			list.add("X"); // НЕТ ConcurrentModificationException
		}
		
		System.out.println(list);
	}
}

// 📌 Что тут происходит
// при add() → копируется весь массив
// итератор работает со snapshot

//❗ Использовать только если:
// много чтений
// мало записей