package dev.nelon.structural.bridge.city;

public class Odessa implements City{
	@Override
	public void deliver(String packageName) {
		System.out.println("Delivering " + packageName + " to Odessa");
	}
}
