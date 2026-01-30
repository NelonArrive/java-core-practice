package dev.nelon.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CustomObjectSetDemo {
	
	static class User {
		private final int id;
		private final String name;
		
		User(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof User)) return false;
			User user = (User) o;
			return id == user.id;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}
		
		@Override
		public String toString() {
			return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
		}
	}
	
	public static void main(String[] args) {
		Set<User> users = new HashSet<>();
		
		users.add(new User(1, "Alice"));
		users.add(new User(1, "Bob")); // не добавится (id одинаковый)
		users.add(new User(2, "Charlie"));
		
		System.out.println("Users:");
		for (User user : users) {
			System.out.println(user);
		}
	}
}
