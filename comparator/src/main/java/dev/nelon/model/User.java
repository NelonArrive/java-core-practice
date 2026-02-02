package dev.nelon.model;

public class User implements Comparable<User>{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(User other) {
		return Integer.compare(this.age, other.age);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}
