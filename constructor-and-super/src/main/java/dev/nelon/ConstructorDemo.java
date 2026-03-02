package dev.nelon;

class Person {
	String name;
	int age;
	
	Person() {
		name = "Unknown";
		age = 0;
		System.out.println("Пустой конструктор Person вызван");
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Конструктор Person с параметрами вызван");
	}
	
	void displayInfo() {
		System.out.println("Имя: " + name + ", возраст: " + age);
	}
}

// Подкласс, который наследует Person
class Employee extends Person {
	String position;
	
	// Пустой конструктор подкласса
	Employee() {
		super(); // Явный вызов пустого конструктора родителя
		position = "Unknown";
		System.out.println("Пустой конструктор Employee вызван");
	}
	
	// Конструктор с параметрами подкласса
	Employee(String name, int age, String position) {
		super(name, age); // Вызов конструктора родителя с параметрами
		this.position = position;
		System.out.println("Конструктор Employee с параметрами вызван");
	}
	
	@Override
	void displayInfo() {
		super.displayInfo(); // Можно использовать метод родителя
		System.out.println("Должность: " + position);
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		Person person = new Person("Alice", 25);
		person.displayInfo();
		
		System.out.println("-------------------------");
		
		Employee emp1 = new Employee(); // вызов пустого конструктора
		emp1.displayInfo();
		
		System.out.println("-------------------------");
		
		Employee emp2 = new Employee("Bob", 30, "Developer"); // вызов конструктора с параметрами
		emp2.displayInfo();
	}
}
