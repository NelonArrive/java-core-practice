package dev.nelon.model;

public class Person {
	private final String name;
	private final String city;
	private final int age;
	
	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name + "(" + city + ", " + age + ")";
	}
}
