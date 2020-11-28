package application;

public class Menu {
	// instance variables
	private String[] options = { "View Database", "View Items", "Delete Items", "Quit Program" };

	// getter
	public String getDisplayOptions() {
		String text = "Choose an option:\n";
		for (int i = 0; i < options.length; i++) {
			text += String.format("%d. %s\n", (i + 1), options[i]);
		}
		return text;
	}
}
