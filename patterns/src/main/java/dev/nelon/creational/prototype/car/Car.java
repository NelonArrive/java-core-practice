package dev.nelon.creational.prototype.car;

public class Car implements Cloneable {
	private String model;
	private int year;

	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	@Override
	public Car clone() {
		try {
			return (Car) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void info() {
		System.out.println(model + " " + year);
	}
}
