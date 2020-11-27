
class Animal {
	String name;
	String type;
	int age;
}

public class playingWithObjects {

	public static void main(String[] args) {
		Animal fourLeggedanimal = new Animal();
		fourLeggedanimal.name = "Ivy";
		fourLeggedanimal.type = "dog";
		fourLeggedanimal.age = 20;

		System.out.println(fourLeggedanimal.name);
		System.out.println(fourLeggedanimal.type);
		System.out.println(fourLeggedanimal.age);

	}

}
