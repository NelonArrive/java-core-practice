package dev.nelon.creational.abstract_factory;

public class Main {
	public static void main(String[] args) {

		GUIFactory factory;

		String os = "windows";

		if (os.equalsIgnoreCase("windows")) {
			factory = new WindowsFactory();
		} else {
			factory = new MacFactory();
		}

		Application app = new Application(factory);

		app.paint();
	}
}
