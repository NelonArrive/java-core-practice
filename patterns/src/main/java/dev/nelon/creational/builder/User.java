package dev.nelon.creational.builder;

public class User {

	private final String name;
	private final String email;
	private final int age;
	private final String city;

	private User(Builder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.age = builder.age;
		this.city = builder.city;
	}

	public static class Builder {
		private final String name; // обязательное
		private String email;
		private int age;
		private String city;

		public Builder(String name) {
			this.name = name;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}
}