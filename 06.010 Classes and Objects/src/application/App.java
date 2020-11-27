package application;

/** Person Class */
class Person2 {
	String name;

}

public class App {

	public static void main(String[] args) {
		Person2 person1 = new Person2(); // refers to the Object person and type person
		person1.name = "Mary"; // creating a person with name data.

		Person2 person2 = new Person2();
		person2.name = "Joseph"; // creating another person

		System.out.printf("%s, %s", person1.name, person2.name);

	}

}