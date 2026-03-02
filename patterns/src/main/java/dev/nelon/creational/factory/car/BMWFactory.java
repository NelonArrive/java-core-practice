package dev.nelon.creational.factory.car;

public class BMWFactory extends CarFactory {
	@Override
	public Car createCar() {
		return new BMW();
	}
}
