package dev.nelon.structural.bridge;

public class Square extends Shape {
	public Square(Color color) {
		super(color);
	}

	public void draw() {
		System.out.print("Square drawn in ");
		color.applyColor();
	}
}
