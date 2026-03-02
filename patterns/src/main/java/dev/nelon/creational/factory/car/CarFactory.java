package dev.nelon.creational.factory.car;

public abstract class CarFactory {
	public abstract Car createCar(); // Factory Method

	public void startDriving() {
		Car car = createCar(); // не знаем конкретный класс!
		car.drive();
	}

}
