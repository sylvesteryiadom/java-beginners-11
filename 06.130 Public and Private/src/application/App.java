package application;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(26);
		p1.setName("Emmanuel");

		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}

}
