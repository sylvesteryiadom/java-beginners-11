package application;

public class Menu {
	String[] option = { "View database", "View items", "Delete items", "Quit program" };

	String getDisplay() {
		String sentence = "";
		System.out.println("Choose an option: ");
		for (int i = 0; i < option.length; i++) {
			sentence += String.format("%d. %s\n", (i + 1), option[i]);
		}
		return sentence;
	}
}
