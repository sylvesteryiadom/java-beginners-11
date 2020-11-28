package application;

public class Person {
	private String name;
	private double height;

	// constructor
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public Person() {
		this.name = "Default name";
		this.height = 0.0;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// getters
	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	// to String method
	@Override
	public String toString() {
		return "Name: " + this.name + "\n" + "Height: " + this.height;

	}
}