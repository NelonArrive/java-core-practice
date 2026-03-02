package dev.nelon.creational.abstract_factory;

public class MacFactory implements GUIFactory {
	public Button createButton() {
		return new MacButton();
	}

	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}