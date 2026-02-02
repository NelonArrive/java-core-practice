package dev.nelon.comparator;

import dev.nelon.model.User;

import java.util.Comparator;

public class ComparatorByName implements Comparator<User> {
	@Override
	public int compare(User u1, User u2) {
		return u1.getName().compareTo(u2.getName());
	}
}