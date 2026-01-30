package dev.nelon;

final class FinalDemo {
	
	// static final константа
	public static final double PI = 3.14159;
	
	// обычная final переменная
	private final int id;
	
	public FinalDemo(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		System.out.println("Константа PI = " + FinalDemo.PI);
		
		FinalDemo demo = new FinalDemo(100);
		demo.showId();
		
		demo.greet("Nelon");
		
		// Пример работы с final объектом
		final StringBuilder sb = new StringBuilder("Start");
		sb.append(" -> End"); // можно изменять объект
		System.out.println(sb);
		// sb = new StringBuilder("New"); // Ошибка! нельзя переназначить ссылку
		
		// Попытка наследования (для проверки)
		// class ChildDemo extends FinalDemo {} // Ошибка! нельзя наследовать final класс
	}
	
	// final метод - нельзя переопределять
	public final void showId() {
		System.out.println("ID = " + id);
	}
	
	// метод с final параметром
	public void greet(final String name) {
		// name = "Someone"; // Ошибка! нельзя менять final параметр
		System.out.println("Hello, " + name);
	}
}
