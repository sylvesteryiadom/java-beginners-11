package application;

public class Person {
	// instance variables
	String name;
	int age;

	/** SETTERS */
	void setName(String theName) {
		name = theName;
	}

	void setAge(int theAge) {
		age = theAge;
	}

	/** GETTERS (RETURNERS) */
	String getName() {
		return this.name;
	}

	int getAge() {
		return this.age;
	}
}
