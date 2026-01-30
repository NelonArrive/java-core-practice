package dev.nelon.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		// как очередь
		deque.offerLast(1);
		deque.offerLast(2);
		deque.offerLast(3);
		
		System.out.println(deque); // [1, 2, 3]
		
		System.out.println(deque.pollFirst()); // 1
		System.out.println(deque.pollFirst()); // 2
		
		// как стек
		deque.push(100);
		deque.push(200);
		
		System.out.println(deque); // [200, 100, 3]
		
		System.out.println(deque.pop()); // 200
	}
}
