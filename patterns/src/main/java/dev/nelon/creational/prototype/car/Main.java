package dev.nelon.creational.prototype.car;

public class Main {
	public static void main(String[] args) {
		Car prototype = new Car("BMW", 2020);

		Car copy1 = prototype.clone();
		copy1.setYear(2023);

		prototype.info();
		copy1.info();
	}
}
