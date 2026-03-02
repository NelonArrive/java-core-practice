package dev.nelon;

public class StringPoolDemo {
	
	public static void main(String[] args) {
		// 1. Строковые литералы — STRING POOL
		String a = "hello";
		String b = "hello";
		
		// Оба указывают на один объект в String Pool
		System.out.println(a == b);          // true
		System.out.println(a.equals(b));     // true
		
		// 2. new String() — ОБЪЕКТ В HEAP (НЕ Pool)
		String c = new String("hello");
		
		System.out.println(a == c);          // false (разные ссылки)
		System.out.println(a.equals(c));     // true (одинаковое содержимое)
		
		// 3. intern() — принудительно кладём в String Pool
		String d = c.intern();
		
		System.out.println(a == d);          // true
		System.out.println(c == d);          // false
		
		// 4. Компиляция vs Runtime
		String e = "hel" + "lo";              // compile-time
		System.out.println(a == e);           // true
		
		String part1 = "hel";
		String part2 = "lo";
		String f = part1 + part2;             // runtime
		
		System.out.println(a == f);           // false
		System.out.println(a.equals(f));      // true
		
		// 6. Реальный кейс с бэка (например, ключи/статусы)
		String statusFromDb = new String("ACTIVE");
		String statusConstant = "ACTIVE";
		
		if (statusFromDb.equals(statusConstant)) {
			System.out.println("Status equals works");
		}
		
		// ❌ Плохо
		System.out.println(statusFromDb == statusConstant); // false
		
		// ✅ Если очень надо сравнивать по ссылке
		statusFromDb = statusFromDb.intern();
		System.out.println(statusFromDb == statusConstant); // true
	}
}
