package application;

import java.util.Random;

public class RandomWord {
	// instance variables
	private String[] words = { "specific", "classify", "tongue", "nothing", "family", "infant", "father", "blacksmith",
			"tombestone", "photograph" };
	private Random random = new Random(); // Java random util class to create a random value.
	private String chosenWord;
	private char[] characters;

	// constructor (always gets called as soon as an object is created
	public RandomWord() {
		chosenWord = words[random.nextInt(words.length)]; // chooses a random word from the array of words
		characters = new char[chosenWord.length()]; // set the length of the character array to the size of chosenWord
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (char c : characters) { // Ternary operator
			sb = (c == '\u0000') ? sb.append('_') : sb.append(c);
			sb.append(' '); // adding spaces in tbetween characters
		}
		return sb.toString();
	}

	public boolean addGuess(char c) {
		// Fill in c in the character array wherever it is found in the random word.
		for (int i = 0; i < chosenWord.length(); i++) {
			if (c == chosenWord.charAt(i)) {
				characters[i] = c;
				return true;
			}

		}
		return false;
	}

	public boolean isComplete() {
		for (char c : characters) {
			if (c == '\u0000') {
				return false;
			}
		}
		return true;
	}

	public void checkInput(String c) {
		return;

	}

	public boolean checkLetter() {
		return true;
	}

}
