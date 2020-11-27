package application;

/** Person Class */
class Person {
	String name;

}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person(); // refers to the Object person and type person
		person1.name = "Mary"; // creating a person with name data.

		Person person2 = new Person();
		person2.name = "Joseph"; // creating another person

		System.out.printf("%s, %s", person1.name, person2.name);

	}

}