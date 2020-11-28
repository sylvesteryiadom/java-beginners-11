package application;

public class Menu {
	// instance variable
	String[] options = { "View database", "Add new item", "Delete item", "Quit Program" };

	void display() {
		System.out.println("Choose an option: ");
		for (int i = 0; i < options.length; i++) {
			System.out.println((i + 1) + ". " + options[i]);
		}
	}

}
