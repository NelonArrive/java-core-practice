package dev.nelon.structural.bridge.city;

public abstract class Delivery {
	protected City city;

	public Delivery(City city) {
		this.city = city;
	}

	abstract void send(String packageName);
}
