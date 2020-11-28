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
		String text = "";
//		characters[1] = 'c';
		for (char c : characters) {
			if (c == '\u0000') { // unicode for null
				text += '_';
			} else {
				text += c;
			}
		}
		return text;
	}

}
