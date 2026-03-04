package dev.nelon.structural.bridge.city;

public class Main {
	public static void main(String[] args) {
		Delivery odessaStandard = new StandardDelivery(new Odessa());
		Delivery kievExpress = new ExpressDelivery(new Kiev());

		odessaStandard.send("Books");  // Standard delivery: Delivering Books to Odessa
		kievExpress.send("Laptop");    // Express delivery: Delivering Laptop to Kiev
	}
}