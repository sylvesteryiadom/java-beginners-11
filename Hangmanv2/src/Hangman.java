import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		System.out.println("Starting game ....");

		// variables
		String[] words = { "battle", "sing", "loving", "amanda", "squatting", "photograph", "mosque", "church",

				"shrine" }; // random words to choose from
		String randomWord = words[(int) (Math.random() * words.length)]; // pick random word from list of words
		System.out.println("The word has " + randomWord + " letters.");

		char[] letters = new char[randomWord.length()]; // using random selected word to create an array

		for (int i = 0; i < letters.length; i++) {
			System.out.print('_');
			System.out.print(" ");
		}
		System.out.println();

		int lives = 3; // X,X,X
		// game starts
		Scanner scan = new Scanner(System.in);

		while (lives > 0)

		{
			System.out.print("Lives: ");
			for (int i = 0; i < lives; i++) {
				System.out.print("X");
			}
			System.out.println();
			System.out.println("User Input: ");
			String input = scan.nextLine();
			char letter = input.charAt(0); // capture the first letter of the users input.

			boolean isGuessedCorrect = false;

			for (int i = 0; i < randomWord.length(); i++) {
				char l = randomWord.charAt(i); // create character for randomWord

				if (l == letter) { // compare user input to any of the words in the randomWord
					letters[i] = l; // replace
					isGuessedCorrect = true;
				}
			}
			if (!isGuessedCorrect) {
				lives--;
			}
			System.out.print("Word: ");

			for (int i = 0; i < letters.length; i++) {
				System.out.print(letters[i]);
			}
			System.out.println();

		}
		System.out.println("Exiting game....");

	}

}