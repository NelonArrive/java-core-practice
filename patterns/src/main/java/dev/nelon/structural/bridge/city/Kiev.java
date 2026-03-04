package dev.nelon.structural.bridge.city;

class Kiev implements City {
	public void deliver(String packageName) {
		System.out.println("Delivering " + packageName + " to Kiev");
	}
}