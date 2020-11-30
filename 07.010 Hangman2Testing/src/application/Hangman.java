package application;

import java.util.Scanner;

public class Hangman {
	// instance variables
	private boolean gameRunning = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int triesLeft = 10;
//	private char lastGuess;

	// run method
	public void run() {

		do { // loop to display question to user
			displayWord();
			getUserInput();
			checkTriesLeft();
			checkUserInput();
		} while (gameRunning);

	}

	public void checkTriesLeft() {
		if (word.checkLetter()) {
			triesLeft -= 1;
			System.out.println("You have " + triesLeft + " left");
		}
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
//		word.addGuess(lastGuess);
		if (word.isComplete()) {
			System.out.println("You have won!!");
			System.out.println("The word is " + word);
			gameRunning = false;
		}
	}

	public void close() {
		// close the scanner object
		scanner.close();
	}
}
