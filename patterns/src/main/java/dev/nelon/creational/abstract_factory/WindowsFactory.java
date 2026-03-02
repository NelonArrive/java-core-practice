package dev.nelon.creational.abstract_factory;

public class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}

	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}