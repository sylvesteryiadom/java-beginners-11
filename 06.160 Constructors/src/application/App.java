package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person("Mary", 120.0);
		Person person2 = new Person("Joseph", 190.0);

		System.out.println(person1.toString());
		System.out.print("------------\n");
		System.out.println(person2.toString());

	}

}
