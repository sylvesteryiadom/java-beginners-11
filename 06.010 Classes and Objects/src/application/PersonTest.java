package application;

public class PersonTest {

	public static void main(String[] args) {

		Person malePerson = new Person();
		Person femalePerson = new Person();

		malePerson.name = "Joe";
		malePerson.country = "England";
		malePerson.age = 30;
		malePerson.sayHello(); // calling the method

		femalePerson.name = "Mary";
		femalePerson.country = "Ghana";
		femalePerson.age = 33;

		System.out.println(malePerson.name);
		System.out.println(malePerson.country);
		System.out.println(malePerson.age);

		System.out.println("===================");
		System.out.println(femalePerson.name);
		System.out.println(femalePerson.country);
		System.out.println(femalePerson.age);
	}

}
