package dev.nelon;

import java.util.Objects;

class Laptop {
	String model;
	int price;
	
	@Override
	public String toString() {
		return "Laptop{" +
			"model='" + model + '\'' +
			", price=" + price +
			'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Laptop laptop = (Laptop) o;
		return price == laptop.price && Objects.equals(model, laptop.model);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
}

public class Main {
	public static void main(String[] args) {
		Laptop obj1 = new Laptop();
		obj1.model = "Model";
		obj1.price = 1000;
		
		Laptop obj2 = new Laptop();
		obj2.model = "Model";
		obj2.price = 1000;
		
		boolean res = obj1.equals(obj2);
		
		System.out.println(res);
	}
}
