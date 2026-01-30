package dev.nelon.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(10);
		pq.offer(1);
		pq.offer(5);
		pq.offer(3);
		
		System.out.println(pq); // порядок НЕ гарантирован
		
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
