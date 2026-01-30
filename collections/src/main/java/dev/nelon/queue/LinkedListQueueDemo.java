package dev.nelon.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		System.out.println(queue); // [A, B, C]
		
		System.out.println(queue.poll()); // A
		System.out.println(queue.poll()); // B
		
		queue.offer("D");
		
		System.out.println(queue); // [C, D]
	}
}

//📌 Под капотом:
// двусвязный список
// O(1) на края
// больше памяти (Node объекты)
// хуже cache locality
//❗Сейчас почти всегда хуже ArrayDeque, если не нужен List-функционал.