package application;

import java.util.Scanner;

public class Hangman {
	// instance variables
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);

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
		// ask the user to enter a character
		// Get the character as a string
		// pass the character to RandomWord as an argument to a method
		System.out.println("Enter a character: ");
		String guess = scanner.nextLine();

		word.addGuess(guess.charAt(0));

	}

	public void checkUserInput() {
//		System.out.println("checkUserInput");
//		String c;
//		word.checkInput(c)
	}
}
