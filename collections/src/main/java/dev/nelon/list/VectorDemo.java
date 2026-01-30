package dev.nelon.list;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		
		System.out.println(vector);
	}
}

// 📌 Почему не использовать
// все методы synchronized
// хуже производительность
// остался для совместимости