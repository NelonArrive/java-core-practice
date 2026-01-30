package dev.nelon.set;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetDemo {
	
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	static void main(String[] args) {
		Set<Day> days = EnumSet.of(Day.MONDAY, Day.FRIDAY);
		
		days.add(Day.SUNDAY);
		days.add(Day.MONDAY); // дубликат
		
		System.out.println("EnumSet:");
		for (Day day : days) {
			System.out.println(day);
		}
		
		System.out.println("Contains FRIDAY: " + days.contains(Day.FRIDAY));
	}
}

// 📌 Почему топ:
// максимально быстрый
// минимум памяти
// ВСЕГДА используй для enum