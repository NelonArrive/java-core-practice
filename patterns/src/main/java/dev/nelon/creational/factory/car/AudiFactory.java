package dev.nelon.creational.factory.car;

public class AudiFactory extends CarFactory {
	@Override
	public Car createCar() {
		return new Audi();
	}
}
