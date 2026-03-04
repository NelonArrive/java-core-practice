package dev.nelon.structural.bridge.city;

public class StandardDelivery extends Delivery {
	public StandardDelivery(City city) {
		super(city);
	}

	@Override
	void send(String packageName) {
		System.out.println("Standard delivery: ");
		city.deliver(packageName);
	}
}
