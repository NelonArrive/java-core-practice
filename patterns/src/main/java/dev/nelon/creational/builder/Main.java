package dev.nelon.creational.builder;

public class Main {
	public static void main(String[] args) {
		User user = new User.Builder("Nelon")
			.email("nelon@mail.com")
			.age(28)
			.city("Amsterdam")
			.build();
	}
}
