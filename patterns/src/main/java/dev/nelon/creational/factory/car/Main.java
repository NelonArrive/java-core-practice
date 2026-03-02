package dev.nelon.creational.factory.car;

public class Main {
	public static void main(String[] args) {
		CarFactory factory = new BMWFactory();
		factory.startDriving();
	}
}
