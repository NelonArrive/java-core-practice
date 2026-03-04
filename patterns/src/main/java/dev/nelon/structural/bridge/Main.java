package dev.nelon.structural.bridge;

public class Main {
	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedColor());
		Shape blueSquare = new Square(new BlueColor());

		redCircle.draw();   // Circle drawn in Applying red color
		blueSquare.draw();  // Square drawn in Applying blue color
	}
}
