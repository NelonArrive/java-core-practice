import java.util.Scanner;

public class Main {
	static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int number = scanner.nextInt();
		
		evenNumber(number);
	}
	
	
	public static void evenNumber(int num) {
		if (num % 2 == 0) {
			System.out.println("Число чётное");
		} else {
			System.out.println("Число нечётное");
		}
	}
}
