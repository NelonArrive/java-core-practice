package dev.nelon.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveEqualsDemo {
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		users.add(new User("Bob"));
		users.add(new User("Alice"));
		
		users.remove(new User("Bob")); // работает из-за equals
		
		System.out.println(users.size()); // 1
	}
	
	static class User {
		String name;
		
		User(String name) {
			this.name = name;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof User)) return false;
			return name.equals(((User) o).name);
		}
		
		@Override
		public int hashCode() {
			return name.hashCode();
		}
	}
}
