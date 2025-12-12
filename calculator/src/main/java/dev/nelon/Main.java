package dev.nelon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите первое число: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Введите второе число: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Введите *, /, +, - : ");
		String operator = scanner.next();
		
		switch (operator) {
			case "+" -> System.out.println(inc(num1, num2));
			case "-" -> System.out.println(dec(num1, num2));
			case "*" -> System.out.println(multiplication(num1, num2));
			case "/" -> System.out.println(division(num1, num2));
			default -> System.out.println("Неверный оператор");
		}
		if (operator.equals("/") && num2 == 0) {
			System.out.println("На 0 делить нельзя!");
		} else if (operator.equals("/")) {
			System.out.println(division(num1, num2));
		}
	}
	
	public static int inc(int a, int b) {
		return a + b;
	}
	
	public static int dec(int a, int b) {
		return a - b;
	}
	
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	public static int division(int a, int b) {
		return a / b;
	}
}