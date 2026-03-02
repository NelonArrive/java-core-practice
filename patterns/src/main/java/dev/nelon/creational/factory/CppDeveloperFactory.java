package dev.nelon.creational.factory;

public class CppDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer createDeveloper() {
		return new CppDeveloper();
	}
}
