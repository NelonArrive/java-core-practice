package dev.nelon.structural.bridge.city;

class ExpressDelivery extends Delivery {
	public ExpressDelivery(City city) {
		super(city);
	}

	public void send(String packageName) {
		System.out.print("Express delivery: ");
		city.deliver(packageName);
	}
}