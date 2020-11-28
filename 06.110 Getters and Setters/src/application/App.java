package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();

		person1.setName("John");
		person1.setAge(22);

		System.out.println(person1.getName()); // getters
		System.out.println(person1.getAge()); // getters

	}
}