package dev.nelon.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println(queue); // [1, 2, 3]
		
		System.out.println(queue.poll()); // 1
		System.out.println(queue.poll()); // 2
		
		queue.offer(4);
		
		System.out.println(queue); // [3, 4]
		
		// queue.add(1, 100); ❌ такого нет
		// Queue не про середину
	}
}

// 📌 Вывод:
// Queue = доступ только к голове, максимум — удаление по значению (remove(Object)), но это O(n).