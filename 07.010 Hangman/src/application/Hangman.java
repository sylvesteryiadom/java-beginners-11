package application;

public class Hangman {
	// instance variables
	private boolean running = false;
	RandomWord word = new RandomWord();

	// run method
	public void run() {

		do { // loop to display question to user
			displayWord();
			getUserInput();
			checkUserInput();
		} while (running);

	}

	public void displayWord() {
		System.out.println(word.toString());
	}

	public void getUserInput() {
		System.out.println("getUserInput");
	}

	public void checkUserInput() {
		System.out.println("checkUserInput");
	}
}
